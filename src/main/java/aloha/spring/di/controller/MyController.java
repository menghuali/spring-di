package aloha.spring.di.controller;

import org.springframework.stereotype.Controller;

import aloha.spring.di.service.GreetingService;
import lombok.extern.slf4j.Slf4j;

/**
 * Demo use of Primary Bean
 */
@Slf4j
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        String message = greetingService.greeting();
        log.info(message);
        return message;
    }

}
