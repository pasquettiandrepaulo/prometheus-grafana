package com.monitoring.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MonitorController {

    @GetMapping
    public ResponseEntity<String> getMonitoring() {
        return ResponseEntity.ok("OK");
    }

}
