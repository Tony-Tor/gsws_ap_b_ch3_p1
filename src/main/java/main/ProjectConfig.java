package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Period;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    public Parrot parrotTest(){
        Parrot parrot = parrot();
        return parrot;
    }

    @Bean
    public Human human(){
        Human h = new Human();
        h.setName("Ella");
        h.setParrot(parrotTest());
        return h;
    }
}
