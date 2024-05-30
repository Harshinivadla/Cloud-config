package com.example.Config_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RefreshScope

public class configClientController {

    @Autowired
    @Lazy
    private RestTemplate template;

    @Value("${config.provider.url}")
    private String url;

    @Value("${config.provider.names.url}")
    private String url1;

    @GetMapping("/getMsg")
    public String hello(){
        String msg = template.getForObject(url, String.class);
        return msg;
    }

    @GetMapping("/getNames")
    public List<String> names(){
        List<String> names = template.getForObject(url1, List.class);
        return names;
    }

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
