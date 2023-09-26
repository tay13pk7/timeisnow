package com.telusko;

public class Alien {

    private int age;

    private Laptop lap;

    public Alien(int age) {
        this.age = age;
    }

    public void setAge(int age)
    {
        System.out.println("setter called");
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }


    public void code()
    {
        System.out.println("I am coding assholes");
        System.out.println(age);
        lap.writingLaptop();
    }

    public void setLap(Laptop lap)
    {
        this.lap = lap;
    }

    public Laptop getLap()
    {
        return lap;
    }



}
