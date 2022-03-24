package aloha.spring.di.service;

import org.springframework.stereotype.Service;

@Service("property")
public class PropertyGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World, Property!";
    }
    
}
