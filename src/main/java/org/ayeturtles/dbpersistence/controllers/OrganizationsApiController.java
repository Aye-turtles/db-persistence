package org.ayeturtles.dbpersistence.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class OrganizationsApiController implements OrganizationsApi {

    private static final Logger log = LoggerFactory.getLogger(OrganizationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public OrganizationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<OrganizationsRes>> organizationsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrganizationsRes>>(objectMapper.readValue("[ {\n  \"dateActive\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"contact\" : {\n    \"name\" : \"name\",\n    \"id\" : 1,\n    \"email\" : \"email\"\n  },\n  \"members\" : [ null, null ],\n  \"name\" : \"name\",\n  \"id\" : 6,\n  \"isActive\" : true,\n  \"dateInactive\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"dateActive\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"contact\" : {\n    \"name\" : \"name\",\n    \"id\" : 1,\n    \"email\" : \"email\"\n  },\n  \"members\" : [ null, null ],\n  \"name\" : \"name\",\n  \"id\" : 6,\n  \"isActive\" : true,\n  \"dateInactive\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrganizationsRes>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrganizationsRes>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organizationsIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganizationsRes> organizationsIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganizationsRes>(objectMapper.readValue("{\n  \"dateActive\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"contact\" : {\n    \"name\" : \"name\",\n    \"id\" : 1,\n    \"email\" : \"email\"\n  },\n  \"members\" : [ null, null ],\n  \"name\" : \"name\",\n  \"id\" : 6,\n  \"isActive\" : true,\n  \"dateInactive\" : \"2000-01-23T04:56:07.000+00:00\"\n}", OrganizationsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganizationsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganizationsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganizationsRes> organizationsIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
,@Parameter(in = ParameterIn.DEFAULT, description = "Organization object with updated information", required=true, schema=@Schema())
                                                               @Valid @RequestBody OrganizationsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganizationsRes>(objectMapper.readValue("{\n  \"dateActive\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"contact\" : {\n    \"name\" : \"name\",\n    \"id\" : 1,\n    \"email\" : \"email\"\n  },\n  \"members\" : [ null, null ],\n  \"name\" : \"name\",\n  \"id\" : 6,\n  \"isActive\" : true,\n  \"dateInactive\" : \"2000-01-23T04:56:07.000+00:00\"\n}", OrganizationsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganizationsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganizationsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganizationsRes> organizationsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Organization object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody OrganizationsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganizationsRes>(objectMapper.readValue("{\n  \"dateActive\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"contact\" : {\n    \"name\" : \"name\",\n    \"id\" : 1,\n    \"email\" : \"email\"\n  },\n  \"members\" : [ null, null ],\n  \"name\" : \"name\",\n  \"id\" : 6,\n  \"isActive\" : true,\n  \"dateInactive\" : \"2000-01-23T04:56:07.000+00:00\"\n}", OrganizationsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganizationsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganizationsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
