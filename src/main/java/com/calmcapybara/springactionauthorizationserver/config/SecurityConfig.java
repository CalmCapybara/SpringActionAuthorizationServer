package com.calmcapybara.springactionauthorizationserver.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {
//    @Bean
//    @Order(2)
//    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
//            throws Exception {
//        http
//                .authorizeHttpRequests((authorize) -> authorize
//                        .anyRequest().authenticated()
//                )
//                // Form login handles the redirect to the login page from the
//                // authorization server filter chain
//                .formLogin();
//
//        return http.build();
//    }
}
