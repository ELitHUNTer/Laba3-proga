package main;

public class Main {

    public static void main(String[] args){
        Knower knower = new Knower(Names.ZNAIKA.getValue());
        SmallMan smallMan1 = new SmallMan(Names.ZNAIKA.getValue());
        SmallMan smallMan2 = new SmallMan(Names.ZNAIKA.getValue());
        Vintik vintik = new Vintik(Names.ZNAIKA.getValue());
        Shpuntik shpuntik = new Shpuntik(Names.ZNAIKA.getValue());
        Pilulkin pilulkin = new Pilulkin(Names.ZNAIKA.getValue());
        Zvezdochkin zvezdochkin = new Zvezdochkin(Names.ZNAIKA.getValue());
        Fuksia fuksia = new Fuksia(Names.ZNAIKA.getValue());
        Seledochka seledochka = new Seledochka(Names.ZNAIKA.getValue());
        Neznaika neznaika = new Neznaika(Names.ZNAIKA.getValue());
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
