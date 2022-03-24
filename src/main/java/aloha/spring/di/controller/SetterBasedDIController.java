package aloha.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import aloha.spring.di.service.GreetingService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SetterBasedDIController {

    private GreetingService greetingService;

    @Qualifier("setter")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        String message = greetingService.greeting();
        log.info(message);
        return message;
    }
    
}
