package com.elastic_beanstalk.elastic_beanstalk.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public String home() {
        return "Pushing Node or Java App image to Amazon Elastic Container Registry";
    }

    public String stressCpu() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 30000) {
            for (int i = 0; i < 1000000; i++) {
                Math.pow(Math.random(), Math.random());
            }
        }
        return "CPU stress test complete";
    }
}
