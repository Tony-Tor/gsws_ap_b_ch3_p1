package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    String name = "Ella";

    Parrot parrot;

    /*public Human(Parrot parrot) {
        this.parrot = parrot;
   }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +
                '}';
    }
}
