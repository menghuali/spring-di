package aloha.spring.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Demo Profile & Default Profile
 */
@Profile({ "ES", "default" })
@Service("i18n")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hola mundo - ES";
    }

}
