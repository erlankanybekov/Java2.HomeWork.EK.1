package com.company;

public class Main {

    public static void main(String[] args) {
    //ObjectA
    Bird bird1 = new Bird("Peter","15 тыс.","Воробей",Color.Black);
        System.out.println(bird1.getInfo());
    bird1.Eat();
        System.out.println("________________________________");

    //ObjectB
    MotherLand motherLand = new MotherLand("Brazil");
    Bird bird2 = new Bird("Jack",motherLand,Color.White,"18 тыс.");
        System.out.println(bird2.getInfo());
    bird2.Fly();
        System.out.println("_________________________________");

    //ObjectС
    Bird bird3 = new Bird("Kesha","10 тыс.",Color.Blue);
        System.out.println(bird3.getInfo());
    bird3.Sitting();
    }
}
