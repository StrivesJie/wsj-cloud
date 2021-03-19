package com.wsj.configure;

import org.springframework.security.web.server.authentication.ServerFormLoginAuthenticationConverter;

/**
 * @ClassName AuthenticationConverter
 * @Author jie
 * @Date 2021/3/19 15:41
 * @Description AuthenticationConverter
 * @Version 1.0
 */
public class AuthenticationConverter extends ServerFormLoginAuthenticationConverter {

    private String usernameParameter = "username";

    private String passwordParameter = "password";
    /*@Override
    public Mono<Authentication> convert(ServerWebExchange exchange) {
        HttpHeaders headers = exchange.getRequest().getHeaders();
        String tenant = headers.getFirst("_tenant");
        String host = headers.getHost().getHostName();
        return exchange.getFormData()
                .map(data -> {
                    String username = data.getFirst(this.usernameParameter);
                    String password = data.getFirst(this.passwordParameter);
                    return new AuthenticationToken(username, password, tenant, host);
                });
    }*/
}
