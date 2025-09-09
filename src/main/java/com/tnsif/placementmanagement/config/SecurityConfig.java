package com.tnsif.placementmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF so Postman can send POST, PUT, DELETE without 403
            .csrf().disable()
            
            // Authorize endpoints
            .authorizeHttpRequests(auth -> auth
                // Allow all CRUD endpoints for testing in Postman
                .requestMatchers(
                    "/users/**",
                    "/students/**",
                    "/colleges/**",
                    "/admins/**",
                    "/placements/**",
                    "/certificates/**",
                    "/student-placements/**"
                ).permitAll()
                
                // Any other request requires authentication
                .anyRequest().authenticated()
            )
            
            // Enable HTTP Basic Auth
            .httpBasic();

        return http.build();
    }
}
