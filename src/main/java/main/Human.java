package main;

public class Human {
    String name;
    Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

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
