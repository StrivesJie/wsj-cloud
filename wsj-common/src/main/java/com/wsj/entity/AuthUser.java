package com.wsj.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * @author jie
 */
@Data
public class AuthUser implements Serializable {
    private static final long serialVersionUID = 3816792638125273952L;

    private Long id;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
