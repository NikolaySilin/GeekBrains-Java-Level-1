package ru.geekbrains.lesson_6;

abstract class Animal {

    protected String name;
    protected String type;
    protected String swimming;
    protected int run;
    protected double jump;

    public Animal(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(this.type + " | " + this.name + " | Run: " + this.run + " m., Swim: " + this.swimming + " , Jump: " + this.jump + " m.");
        }



}