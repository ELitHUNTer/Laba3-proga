package main;

public class SmallMan extends Human {


    public SmallMan(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Коротышка " + name + " ощутил тяжесть");
    }
}
