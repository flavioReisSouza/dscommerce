package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.exceptions.ForbiddenException;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public void validateSelfOrAdmin(Long userId) {
        User user = userService.authenticated();
        if (!user.hasRole("ROLE_ADMIN") && !user.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }
}
