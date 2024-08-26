package com.application.kafka.controller;

import com.application.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage(message);
        return "Message published: " + message;
    }
}
