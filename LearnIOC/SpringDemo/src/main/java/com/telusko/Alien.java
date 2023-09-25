package com.telusko;

public class Alien {

    public int age;

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
    }

}
