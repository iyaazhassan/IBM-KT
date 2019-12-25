package com.example.demo.config;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.listener.JobListener;
import com.example.demo.model.Member;
import com.example.demo.processor.MemberProcessor;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<Member> reader() {
        FlatFileItemReader<Member> reader = new FlatFileItemReader<Member>();
        reader.setResource(new ClassPathResource("members.csv"));

        reader.setLineMapper(new DefaultLineMapper<Member>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] { "memberId","personId","prefix","firstName","middleName","lastName","suffix","dob","gender","ssn","horizonEmployeeIndicator" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper() {{
                setTargetType(Member.class);
            }});
        }});
        return reader;
    }


    @Bean
    public MemberProcessor processor() {
        return new MemberProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Member> writer() {
        JdbcBatchItemWriter<Member> writer = new JdbcBatchItemWriter<Member>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
        writer.setSql("INSERT INTO members (memberId,personId,prefix,firstName,middleName,lastName,suffix,dob,gender,ssn,horizonEmployeeIndicator) " +
                "VALUES (:memberId,:personId,:prefix,:firstName,:middleName,:lastName,:suffix,:dob,:gender,:ssn,:horizonEmployeeIndicator)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job importUserJob(JobListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Member, Member> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

}
