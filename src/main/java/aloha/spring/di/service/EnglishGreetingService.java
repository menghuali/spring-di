package aloha.spring.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Demo Profile
 */
@Profile("EN")
@Service("i18n")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World - EN!";
    }
    
}
