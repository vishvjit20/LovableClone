package com.vj.projects.lovable_clone.service;

import com.vj.projects.lovable_clone.dto.auth.UserProfileResponse;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
