package com.vj.projects.lovable_clone.service.impl;

import com.vj.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.vj.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vj.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.vj.projects.lovable_clone.service.UsageService;
import com.vj.projects.lovable_clone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
