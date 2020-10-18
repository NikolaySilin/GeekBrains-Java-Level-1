package ru.geekbrains.lesson_7;

public class Plate
{
    public int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void decreaseFood(int x)
    {
        this.food -= x;
    }

    // Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood()
    {
        System.out.println("Filling the bowl.");
        while (food < 100)
        this.food++;
    }

    public void info()
    {
        System.out.println("Plate: " + food);
    }

}
