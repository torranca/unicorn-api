package com.unicorn.bank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-11T17:32:40.795760Z[Europe/London]")
@Controller
@RequestMapping("${openapi.swaggerHelloUnicornBank.base-path:}")
public class UnicornsApiController implements UnicornsApi {

    private final UnicornsApiDelegate delegate;

    public UnicornsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UnicornsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UnicornsApiDelegate() {});
    }

    @Override
    public UnicornsApiDelegate getDelegate() {
        return delegate;
    }

}
