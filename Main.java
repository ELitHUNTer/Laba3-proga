package main;

public class Main {

    public static void main(String[] args){
        Knower knower = new Knower(Names.ZNAIKA.getValue());
        SmallMan smallMan1 = new SmallMan(Names.SMALLMAN1.getValue());
        SmallMan smallMan2 = new SmallMan(Names.SMALLMAN2.getValue());
        Vintik vintik = new Vintik(Names.VINTIK.getValue());
        Shpuntik shpuntik = new Shpuntik(Names.SHPUNTIC.getValue());
        Pilulkin pilulkin = new Pilulkin(Names.PILULKIN.getValue());
        Zvezdochkin zvezdochkin = new Zvezdochkin(Names.ZVEZDOCHKIN.getValue());
        Fuksia fuksia = new Fuksia(Names.FUKSIA.getValue());
        Seledochka seledochka = new Seledochka(Names.SELEDOCHKA.getValue());
        Neznaika neznaika = new Neznaika(Names.NEZNAIKA.getValue());
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
