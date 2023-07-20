package main;

public class Parrot {
    String name;

    public Parrot() {
        System.out.println("Попка создан");
    }

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
