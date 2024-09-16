package org.ayeturtles.dbpersistence.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
public interface OrganizationsApi {

    @Operation(summary = "Get all organizations", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of organizations", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrganizationsRes.class)))) })
    @RequestMapping(value = "/organizations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OrganizationsRes>> organizationsGet();


    @Operation(summary = "Delete an organization", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Organization deleted successfully"),
        
        @ApiResponse(responseCode = "404", description = "Organization not found") })
    @RequestMapping(value = "/organizations/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> organizationsIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
);


    @Operation(summary = "Get an organization by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An organization object", content = @Content(mediaType = "application/json", schema = @Schema(implementation = OrganizationsRes.class))),
        
        @ApiResponse(responseCode = "404", description = "Organization not found") })
    @RequestMapping(value = "/organizations/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrganizationsRes> organizationsIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
);


    @Operation(summary = "Update an organization", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Organization updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = OrganizationsRes.class))),
        
        @ApiResponse(responseCode = "404", description = "Organization not found") })
    @RequestMapping(value = "/organizations/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<OrganizationsRes> organizationsIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
, @Parameter(in = ParameterIn.DEFAULT, description = "Organization object with updated information", required=true, schema=@Schema())
                                                        @Valid @RequestBody OrganizationsReq body
);


    @Operation(summary = "Create a new organization", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Organization created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = OrganizationsRes.class))) })
    @RequestMapping(value = "/organizations",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<OrganizationsRes> organizationsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Organization object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody OrganizationsReq body
);

}

