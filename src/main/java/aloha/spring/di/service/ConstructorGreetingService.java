package aloha.spring.di.service;

import org.springframework.stereotype.Service;

@Service("constructor")
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World, Constructor!";
    }
    
}
