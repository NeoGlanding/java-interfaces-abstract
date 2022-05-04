package com.ihsanabd;

public class Dog extends Animal implements Walk{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void forward() {
        System.out.println("Dog moving forward");
    }

    @Override
    public void backward() {
        System.out.println("Dog moving backward");
    }

    @Override
    public void right() {
        System.out.println("Dog moving right");
    }

    @Override
    public void left() {
        System.out.println("Dog moving left");
    }
}
