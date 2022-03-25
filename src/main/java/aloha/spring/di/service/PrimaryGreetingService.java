package aloha.spring.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hellow World, Primary Bean!";
    }

}
