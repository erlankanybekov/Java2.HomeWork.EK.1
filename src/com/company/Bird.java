package com.company;

public final class Bird extends Characteristic {
    private String Name;
    private String cost;
    private String breed;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public  Bird(String name, String cost, String breed,Color color) {
        Name = name;
        this.cost = cost;
        this.breed = breed;
        super.setColor(color);
    }
    public Bird(String name, String cost,Color color) {
        Name = name;
        this.cost = cost;
        super.setColor(color);

    }
    public Bird(String name,MotherLand motherLand, Color color,String cost) {
        Name = name;
        this.cost = cost;
        super.setMotherLand(motherLand);
        super.setColor(color);
    }

    public  void Eat(){
        System.out.println(Name + " is eating");
    }
    public void Fly(){
        System.out.println(Name+" is Flying");

    }
    public final void Sitting(){
        System.out.println(Name+" is Sitting");
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + Name +
                "\nBreed: "+ breed +
                "\nCost: "+ cost;

    }
}
