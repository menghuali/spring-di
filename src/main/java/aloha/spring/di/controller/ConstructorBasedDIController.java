package aloha.spring.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import aloha.spring.di.service.GreetingService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ConstructorBasedDIController {

    private final GreetingService greetingService;

    /**
     * Use constructor to inject dependency. It's preferred over Setter and Property
     * based injections. For constructor based injection, the @Autowried is
     * optional.
     * 
     * Annotate constructor parameter with @Qualifier to tell Spring which bean to
     * inject when an interface has mulitple implementations.
     * 
     * @param greetingService Service to be injected
     */
    public ConstructorBasedDIController(@Qualifier("constructor") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        String message = greetingService.greeting();
        log.info(message);
        return message;
    }

}
