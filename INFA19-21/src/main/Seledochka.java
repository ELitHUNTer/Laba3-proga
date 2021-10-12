package main;

public class Seledochka extends Human implements Standable, HelpStandUpAble {
    public Seledochka(String name) {
        super(name);
    }

    @Override
    public void helpStandUp(Human down) {
        System.out.println(name + " помог подняться " + down.name);
    }

    @Override
    public void doSomething() {
        standUp(this);
    }

    @Override
    public void standUp(Human human) {
        System.out.println(human.name + " поднялся");
    }
}
