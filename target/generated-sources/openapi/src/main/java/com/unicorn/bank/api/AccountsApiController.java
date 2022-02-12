package com.unicorn.bank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-12T11:40:43.041737Z[Europe/London]")
@Controller
@RequestMapping("${openapi.swaggerHelloUnicornBank.base-path:/api/v1}")
public class AccountsApiController implements AccountsApi {

    private final AccountsApiDelegate delegate;

    public AccountsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AccountsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AccountsApiDelegate() {});
    }

    @Override
    public AccountsApiDelegate getDelegate() {
        return delegate;
    }

}
