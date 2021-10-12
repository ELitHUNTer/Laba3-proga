package main;

public enum Names {

    ZNAIKA("Знайка"),
    NEZNAIKA("Незнайка"),
    SMALLMAN1("Коротышка 1"),
    SMALLMAN2("Коротышка 2"),
    VINTIK("Винтик"),
    SHPUNTIC("Шпунтик"),
    PILULKIN("Пилюлькин"),
    ZVEZDOCHKIN("Звездочкин"),
    FUKSIA("Фуксия"),
    SELEDOCHKA("Селедочка");

    private String title;

    Names(String title){
        this.title = title;
    }

    public String getValue(){
        return title;
    }

}
