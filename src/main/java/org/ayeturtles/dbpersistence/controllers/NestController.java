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
import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
public interface NestController {

    @Operation(summary = "Get all nests", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "A list of nests",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = NestsReq.class))))})
    @RequestMapping(value = "/nests",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<NestsRes>> getNests();

    @Operation(summary = "Get nest by ID", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "An specific nest by ID",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = NestsReq.class))))})
    @RequestMapping(value = "/nests/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<NestsRes>> getNestById(@Parameter(in = ParameterIn.PATH, description = "id of the nest", required = true, schema = @Schema()) @PathVariable("id") Integer id
    );

    @Operation(summary = "Delete an nest", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Nest deleted successfully"),

            @ApiResponse(responseCode = "404", description = "nest not found") })
    @RequestMapping(value = "/nest/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNestByID(@Parameter(in = ParameterIn.PATH, description = "id of the nest", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Update an nests", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Nest updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = NestsRes.class))),

            @ApiResponse(responseCode = "404", description = "Nest not found") })
    @RequestMapping(value = "/nests/{id}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<NestsRes> updateNestByID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id
            , @Parameter(in = ParameterIn.DEFAULT, description = "Nest object with updated information", required=true, schema=@Schema())
                                                        @Valid @RequestBody NestsReq body
    );


    @Operation(summary = "Create a new nests", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Nest created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = NestsRes.class))) })
    @RequestMapping(value = "/nests",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<NestsRes> createNest(@Parameter(in = ParameterIn.DEFAULT, description = "Nest object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody NestsReq body
    );
}
