package com.wsj.configure;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;


@AllArgsConstructor
@Configuration
@EnableWebFluxSecurity
public class WebFluxSecurityConfigure {

    /*private final AuthorizationManager authorizationManager;
    private final IgnoreUrlsConfig ignoreUrlsConfig;
    private final RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    private final RestAuthenticationEntryPoint restAuthenticationEntryPoint;
    private final IgnoreUrlsRemoveJwtFilter ignoreUrlsRemoveJwtFilter;*/

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain securitygWebFilterChain(ServerHttpSecurity http) {

        //对白名单路径，直接移除JWT请求头
        //http.addFilterBefore(ignoreUrlsRemoveJwtFilter, SecurityWebFiltersOrder.AUTHENTICATION);
//        http.authorizeExchange()
//                .pathMatchers(ArrayUtil.toArray(ignoreUrlsConfig.getUrls(),String.class)).permitAll()//白名单配置
//                .anyExchange().access(authorizationManager)//鉴权管理器配置
//                .and().exceptionHandling()
//                .accessDeniedHandler(restfulAccessDeniedHandler)//处理未授权
//                .authenticationEntryPoint(restAuthenticationEntryPoint)//处理未认证
//                .and().csrf().disable();
//        return http.build();
        return http.csrf().disable().build();
    }

}
