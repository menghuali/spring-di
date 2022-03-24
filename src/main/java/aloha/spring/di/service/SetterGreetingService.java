package aloha.spring.di.service;

import org.springframework.stereotype.Service;

@Service("setter")
public class SetterGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World, Setter!";
    }
    
}
