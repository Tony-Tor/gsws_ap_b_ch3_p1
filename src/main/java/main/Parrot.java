package main;

import org.springframework.stereotype.Component;


public class Parrot {
    String name = "KoKo";
    Human human;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
