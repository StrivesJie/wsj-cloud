package com.wsj.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @Auther: wsj
 * @Date: 2021/3/15 19
 * @Description:
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}
