package com.snehal.documentapproval.authservice.authentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/v1/auth/health")
    public ResponseEntity<Map<String,Object>> getHealthReport()
    {
        Map<String, Object> response=Map.of(
            "service","Authentication Service",
                "status","UP",
                "version", "1.0.0"
        );
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
