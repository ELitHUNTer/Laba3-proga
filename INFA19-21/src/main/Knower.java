package main;

public class Knower extends Human {

    public Knower(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Знайка что-то сказал");
    }
}
