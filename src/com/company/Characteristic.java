package com.company;

import java.util.Random;

public class Characteristic {
    private int age = Ages();
    private Color color;
    private MotherLand motherLand;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MotherLand getMotherLand() {
        return motherLand;
    }

    public void setMotherLand(MotherLand motherLand) {
        this.motherLand = motherLand;
    }
    private int Ages(){
        Random random = new Random();
        return random.nextInt(22);
    }

    public String getInfo(){
        if (motherLand != null){
            return "Age: "+ age +
                    "\nColor: "+ color +
                    "\nCountry: "+ motherLand.getCountry();
        }
        else {
            return "Age: "+ age +
            "\nColor: "+ color ;
        }
    }
}
