package aloha.spring.di.service;

import org.springframework.stereotype.Service;

/**
 * Set bean name in @Service so that Spring can inject it by bean name
 * (aka @Qualifier("constructor"))
 */
@Service("constructor")
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World, Constructor!";
    }

}
