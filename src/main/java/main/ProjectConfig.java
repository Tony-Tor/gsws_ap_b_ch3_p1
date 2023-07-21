package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.Period;

@Configuration
public class ProjectConfig {

    @Bean
    //@Primary
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Human person(Parrot parrot2){
        Human h = new Human();
        h.setName("Ella");
        h.setParrot(parrot2);
        return h;
    }

}
