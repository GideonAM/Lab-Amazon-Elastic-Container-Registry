package com.elastic_beanstalk.elastic_beanstalk.controller;

import com.elastic_beanstalk.elastic_beanstalk.service.AppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok(appService.home());
    }
}
