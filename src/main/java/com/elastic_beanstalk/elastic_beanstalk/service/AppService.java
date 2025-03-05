package com.elastic_beanstalk.elastic_beanstalk.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public String home() {
        return "Pushing Node or Java App image to Amazon Elastic Container Registry";
    }
}
