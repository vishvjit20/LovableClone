package com.vj.projects.lovable_clone.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public record JwtUserPrinciple(
        Long userId,
        String userName,
        List<GrantedAuthority> authorities
) {
}
