package main;

import java.util.Objects;

public abstract class Human {

    protected String name;

    public Human(String name){
        this.name = name;
    }

    public abstract void doSomething();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
