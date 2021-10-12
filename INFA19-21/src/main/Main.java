package main;

public class Main {

    public static void main(String[] args){
        Knower knower = new Knower("Знайка");
        SmallMan smallMan1 = new SmallMan("Коротышка 1");
        SmallMan smallMan2 = new SmallMan("Коротышка 2");
        Vintik vintik = new Vintik("Винтик");
        Shpuntik shpuntik = new Shpuntik("Шпунтик");
        Pilulkin pilulkin = new Pilulkin("Пилюлькин");
        Zvezdochkin zvezdochkin = new Zvezdochkin("Звездочкин");
        Fuksia fuksia = new Fuksia("Фуксия");
        Seledochka seledochka = new Seledochka("Селедочка");
        Neznaika neznaika = new Neznaika("Незнайка");
        knower.doSomething();
        smallMan1.doSomething();
        smallMan2.doSomething();
        vintik.doSomething();
        vintik.standUp(neznaika);
        shpuntik.doSomething();
        shpuntik.standUp(neznaika);
        pilulkin.doSomething();
        zvezdochkin.doSomething();
        pilulkin.helpStandUp(fuksia);
        pilulkin.helpStandUp(seledochka);
        zvezdochkin.helpStandUp(fuksia);
        zvezdochkin.helpStandUp(seledochka);
    }

}
