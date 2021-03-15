package com.wsj.controller;

import com.wsj.entity.EsmAuthException;
import com.wsj.entity.EsmResponse;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Author: wsj
 * @Date: 2021/3/15 20
 * @Description:
 */
@RestController
public class SecurityController {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;
    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public EsmResponse signout(HttpServletRequest request) throws EsmAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        EsmResponse esmResponse = new EsmResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new EsmAuthException("退出登录失败");
        }
        return esmResponse.message("退出登录成功");
    }
}
