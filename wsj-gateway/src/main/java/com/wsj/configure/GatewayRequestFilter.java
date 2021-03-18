package com.wsj.configure;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Base64;


/**
 * @author jie
 */
@Component
@Order(1)
public class GatewayRequestFilter implements GlobalFilter {
    private static final String GATEWAY_CLIENT_AUTHORIZATION = "Basic " +
            Base64.getEncoder().encodeToString("wsj:wsj1065".getBytes());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest.Builder mutate = exchange.getRequest().mutate();
        mutate.header("Authorization", GATEWAY_CLIENT_AUTHORIZATION);
        return chain.filter(exchange.mutate().request(mutate.build()).build());
    }
}
