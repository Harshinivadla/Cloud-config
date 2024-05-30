//package com.example.Config_client.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@RestController
//public class configClientController {
//
//    private RestTemplate restTemplate;
//
//    @Value("${config.provider.url}")
//    private String url;
//
//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
//
//    @GetMapping("/getName")
//    public List<String> getNames() {
//        RestTemplate restTemplate = new RestTemplate();
//        List<String> names = restTemplate.getForObject(url, List.class);
//        return names;
//    }
//}