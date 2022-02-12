package com.unicorn.bank.api;

import com.unicorn.bank.model.Error;
import com.unicorn.bank.model.Payment;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PaymentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-12T11:40:43.041737Z[Europe/London]")
public interface PaymentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /payment : Post a Payment
     *
     * @return Payment Accepted (status code 200)
     *         or unexpected error (status code 200)
     * @see PaymentApi#postPayment
     */
    default ResponseEntity<Payment> postPayment() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"reference\" : \"reference\", \"amount\" : 0.08008281904610115, \"fromAccountId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"toAccountId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"currency\" : \"GBP\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
