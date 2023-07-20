package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Human person = context.getBean(Human.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Human's name:" + person.getName());
        System.out.println("Parrot's name:" + parrot.getName());
        System.out.println("Human's parrot:" + person.getParrot());


    }
}
