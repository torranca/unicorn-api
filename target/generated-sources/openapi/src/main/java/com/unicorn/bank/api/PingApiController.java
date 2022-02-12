package com.unicorn.bank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-12T09:39:19.837026Z[Europe/London]")
@Controller
@RequestMapping("${openapi.swaggerHelloUnicornBank.base-path:/api/v1}")
public class PingApiController implements PingApi {

    private final PingApiDelegate delegate;

    public PingApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PingApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PingApiDelegate() {});
    }

    @Override
    public PingApiDelegate getDelegate() {
        return delegate;
    }

}
