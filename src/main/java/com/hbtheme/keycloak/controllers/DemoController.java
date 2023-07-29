package com.hbtheme.keycloak.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "Hello from Spring Boot & Keycloak";
    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasRole('client_admin')")
    public String helloFromAdmin() {
        return "Hello from Spring Boot & Keycloak - ADMIN";
    }

}
