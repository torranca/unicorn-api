package com.unicorn.bank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-15T21:07:09.231484Z[Europe/London]")
@Controller
@RequestMapping("${openapi.swaggerHelloUnicornBank.base-path:/api/v1}")
public class PaymentApiController implements PaymentApi {

    private final PaymentApiDelegate delegate;

    public PaymentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PaymentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PaymentApiDelegate() {});
    }

    @Override
    public PaymentApiDelegate getDelegate() {
        return delegate;
    }

}
