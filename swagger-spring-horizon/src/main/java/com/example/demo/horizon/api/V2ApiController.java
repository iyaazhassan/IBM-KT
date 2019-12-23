package com.example.demo.horizon.api;

import com.example.demo.horizon.model.MemberSearchInputElastic;
import org.threeten.bp.OffsetDateTime;
import com.example.demo.horizon.model.ResponseFailure;
import com.example.demo.horizon.model.ResponseMembersElastic;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

@Controller
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseMembersElastic> v2MembersSearchPost(@ApiParam(value = "Name of the client" ,required=true) @RequestHeader(value="X-HZN-ClientName", required=true) String xHZNClientName,@ApiParam(value = "Date/Time from the client in ISO 8601 date format yyyy-MM-dd'T'HH:mm:ss.SSS'Z' \"Z\" - Zulu time" ,required=true) @RequestHeader(value="X-HZN-ClientSubmitDateTime", required=true) OffsetDateTime xHZNClientSubmitDateTime,@ApiParam(value = "" ,required=true )  @Valid @RequestBody MemberSearchInputElastic body,@Min(1)@ApiParam(value = "page number to be returned", defaultValue = "1") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber,@Min(1) @Max(100) @ApiParam(value = "page limit - the number of members per page to be returned", defaultValue = "100") @Valid @RequestParam(value = "pageLimit", required = false, defaultValue="100") Integer pageLimit,@ApiParam(value = "Unique client transaction Id" ) @RequestHeader(value="X-HZN-ClientTransactionId", required=false) String xHZNClientTransactionId,@ApiParam(value = "Client session id" ) @RequestHeader(value="X-HZN-ClientSessionId", required=false) String xHZNClientSessionId,@ApiParam(value = "Logged in user id - needed for additional tracking." ) @RequestHeader(value="X-HZN-UserId", required=false) String xHZNUserId,@ApiParam(value = "User role -  Role of the user.  Examples: Subscriber, Member, Member Liaison, Provider, Provider Liaison, Internal User" ) @RequestHeader(value="X-HZN-UserRole", required=false) String xHZNUserRole,@ApiParam(value = "**for internal use only**  Current logged in memberId.  For a B2C process, this value will be set based upon the value in the JWT For a B2B process, this value must either be set by the calling client or from the JWT. Note, if the JWT value is populated, it will override the value passed in by the client." ) @RequestHeader(value="X-HZN-RequestingMemberId", required=false) String xHZNRequestingMemberId,@ApiParam(value = "**for internal use only** An internal identifier for the end to end correlation of the API and its related services." ) @RequestHeader(value="X-HZN-RootId", required=false) String xHZNRootId,@ApiParam(value = "**for internal use only** True if the client has been authorized for internal properties.  Otherwise, the properties marked for **internal only** will not be returned." ) @RequestHeader(value="X-HZN-Internal", required=false) Boolean xHZNInternal) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseMembersElastic>(objectMapper.readValue("{  \"pagination\" : {    \"pageLimit\" : 6,    \"total\" : 1,    \"pageNumber\" : 0  },  \"members\" : [ {    \"disabilityEffectiveDate\" : \"2000-01-23\",    \"lastName\" : \"lastName\",    \"gender\" : \"gender\",    \"prefix\" : \"prefix\",    \"disabilityStatus\" : \"disabilityStatus\",    \"horizonEmployeeIndicator\" : true,    \"suffix\" : \"suffix\",    \"ssn\" : \"ssn\",    \"firstName\" : \"firstName\",    \"disabilityEndDate\" : \"2000-01-23\",    \"federalExchangeIndicators\" : {      \"americanIndian\" : true,      \"alaskanNative\" : true    },    \"dob\" : \"2000-01-23\",    \"plans\" : [ {      \"homePlanName\" : \"homePlanName\",      \"homePlanCode\" : \"homePlanCode\"    }, {      \"homePlanName\" : \"homePlanName\",      \"homePlanCode\" : \"homePlanCode\"    } ],    \"medicareNumber\" : \"medicareNumber\",    \"personId\" : \"personId\",    \"middleName\" : \"middleName\",    \"links\" : [ {      \"rel\" : \"rel\",      \"href\" : \"href\"    }, {      \"rel\" : \"rel\",      \"href\" : \"href\"    } ],    \"medicareBeneficiaryIdentifier\" : \"medicareBeneficiaryIdentifier\",    \"memberId\" : \"memberId\"  }, {    \"disabilityEffectiveDate\" : \"2000-01-23\",    \"lastName\" : \"lastName\",    \"gender\" : \"gender\",    \"prefix\" : \"prefix\",    \"disabilityStatus\" : \"disabilityStatus\",    \"horizonEmployeeIndicator\" : true,    \"suffix\" : \"suffix\",    \"ssn\" : \"ssn\",    \"firstName\" : \"firstName\",    \"disabilityEndDate\" : \"2000-01-23\",    \"federalExchangeIndicators\" : {      \"americanIndian\" : true,      \"alaskanNative\" : true    },    \"dob\" : \"2000-01-23\",    \"plans\" : [ {      \"homePlanName\" : \"homePlanName\",      \"homePlanCode\" : \"homePlanCode\"    }, {      \"homePlanName\" : \"homePlanName\",      \"homePlanCode\" : \"homePlanCode\"    } ],    \"medicareNumber\" : \"medicareNumber\",    \"personId\" : \"personId\",    \"middleName\" : \"middleName\",    \"links\" : [ {      \"rel\" : \"rel\",      \"href\" : \"href\"    }, {      \"rel\" : \"rel\",      \"href\" : \"href\"    } ],    \"medicareBeneficiaryIdentifier\" : \"medicareBeneficiaryIdentifier\",    \"memberId\" : \"memberId\"  } ],  \"links\" : [ {    \"rel\" : \"rel\",    \"href\" : \"href\"  }, {    \"rel\" : \"rel\",    \"href\" : \"href\"  } ]}", ResponseMembersElastic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseMembersElastic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseMembersElastic>(HttpStatus.NOT_IMPLEMENTED);
    }

}
