package com.ricardoporfirio.RealTimeMessageApp.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/healthcheck")
@Tag(name="Health Check", description = "Check if the API is up.")
public class HealthCheckController {
    @GetMapping
    String healthcheck(){
        return "Hello Wolrd!";
    }
}
