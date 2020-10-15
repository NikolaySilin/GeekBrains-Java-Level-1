package ru.geekbrains.lesson_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.run = 500;
        this.jump = 0.5;
        this.swimming = "10 m.";
    }
}
