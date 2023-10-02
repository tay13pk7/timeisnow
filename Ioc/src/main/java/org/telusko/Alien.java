package org.telusko;

public class Alien {
    private int age;

    private Computer com;

//    public Alien(int age) {           using this constructor will give error as setter is already use
//        this.age = age;
//    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void code() {
        System.out.println("I am coding assholes");
        System.out.println(this.age);
        com.writingIn();
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }
}
