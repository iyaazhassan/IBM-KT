package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("members")
            .description("**Description:**  Horizon members   | Version | Date | Change | | -------- | -------- | -------- | | 1.0     | 03/17/2017     | Original Version  Approved Version    | | 1.1.1     | 04/24/2017     | Updated Header X-HZN-UserToken, X-HZN-RequestingSubscriberToken, X-HZN-RequestingMemberToken and X-HZN-RootId   | |      |      | Added Prefix and Suffix    | |      |      | Added Employee Indicator    | |      |      | Made memberToken Required     | | 1.1.2   | 06/05/2017     | Removed X-HZN-RequestingSubscriberToken and  status 408   | | 1.1.3   | 06/06/2017     | Removed status 401   | | 1.1     | 06/07/2017     | Approved version   | | 1.2.1     | 07/17/2017     | Updated memberToken references to memberId, memberId to personId,  and Date to DateTime | |1.2.2   | 07/24/2017     | Corrected spelling of the word parameter. Updated personId definition. Updated link to remove member.| | 1.3.1   | 08/03/2017     | Update to remove \"internal\" resources | |    |    | Removed X-HZN-ClientTimeout | | 1.3.2   | 08/08/2017     | Updated  X-HZN-RequestingMemberId description| | 1.3   | 10/15/2017     | Approved | | 1.4.1  | 11/17/2017     | Updated /members/search/ for wildcard search | | 1.4   | 12/12/2017     | Approved | | 1.5.1  | 03/06/2018     | Updated /members/search to allow search by ssn only. Indicated that it must not be passed as blank or all zeroes| | 1.5.2  | 04/09/2018     | Updated /members/search for elastic search| | 1.5.3  | 04/17/2018     | Incorporated Sirisha's feedback moving pageNumber, pageSize to query parameter. Added totalNoOfRecords. | | 1.5.4  | 04/19/2018     | Incorporated ADGQ feedback.| | 1.5.5  | 05/02/2018     | Incorporated Sirisha's feedback.| | 1.5  | 05/07/2018     |  Approved | | 1.6.1  | 06/06/2018     | Updated /members/serch with planCode and planName | | 1.6.2  | 06/11/2018     | Renamed  planCode and planName  to homePlanCode and homePlanName as per ADGQ feedback | | 1.6  | 06/19/2018     |  Approved | | 1.7.1  | 07/19/2018     |  Updated description of member name in POST| | 1.7  |  07/31/2018    |  Approved |  | 1.8.1  |  09/12/2018    |  Updated adding sort parameter to POST for paging|   | 1.8.2  |  09/20/2018    |  Updated sort description per ADGQ feedback| | 1.8    |  09/26/2018    |  Approved | | 1.9.1  |  10/03/2018    |  Updated adding disabilityStatus, disabilityEffectiveDate & disabilityEndDate elements |  | 1.9    |  10/09/2018    |  Approved |  | 1.10.1   |  02/01/2019    |  Separated into V1 (non elastic) and V2 (elastic)|  | 1.10.2   |  02/08/2019    |  Incorporated ADGQ feedback|  | 1.10.3  |  02/20/2019    |  Removed pagination, federalExchangeIndicators, plans from v1 responses |   | 1.10.4  |  03/04/2019    |  Updated responseMembers removing disabilityStatus, disabilityEffectiveDate, and disabilityEndDate | | 1.10 | 03/05/2019 | Approved | | 1.11.1 | 06/05/2019 | Added medicareBeneficiaryIdentifierto  v2/members/search request and medicareBeneficiaryIdentifier / medicareNumber to response | ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.11.1")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.example.demo.horizon.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
