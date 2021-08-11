/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TextPersonNameAnnotationRequest;
import org.openapitools.model.TextPersonNameAnnotationResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
@Validated
@Api(value = "textPersonNameAnnotations", description = "the textPersonNameAnnotations API")
public interface TextPersonNameAnnotationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /textPersonNameAnnotations : Annotate person names in a clinical note
     * Return the person name annotations found in a clinical note
     *
     * @param textPersonNameAnnotationRequest  (optional)
     * @return Success (status code 200)
     *         or Invalid request (status code 400)
     *         or The request cannot be fulfilled due to an unexpected server error (status code 500)
     */
    @ApiOperation(value = "Annotate person names in a clinical note", nickname = "createTextPersonNameAnnotations", notes = "Return the person name annotations found in a clinical note", response = TextPersonNameAnnotationResponse.class, tags={ "TextPersonNameAnnotation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TextPersonNameAnnotationResponse.class),
        @ApiResponse(code = 400, message = "Invalid request", response = Error.class),
        @ApiResponse(code = 500, message = "The request cannot be fulfilled due to an unexpected server error", response = Error.class) })
    @PostMapping(
        value = "/textPersonNameAnnotations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TextPersonNameAnnotationResponse> createTextPersonNameAnnotations(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) TextPersonNameAnnotationRequest textPersonNameAnnotationRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"textPersonNameAnnotations\" : [ { \"start\" : 42, \"length\" : 11, \"text\" : \"Chloe Price\", \"confidence\" : 95.5 }, { \"start\" : 42, \"length\" : 11, \"text\" : \"Chloe Price\", \"confidence\" : 95.5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
