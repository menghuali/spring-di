package aloha.spring.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Demo Profile
 */
@Profile("ES")
@Service("i18n")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hola mundo - ES";
    }
    
}
