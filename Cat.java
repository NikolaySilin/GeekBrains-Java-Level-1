package ru.geekbrains.lesson_7;

public class Cat
{
    public String name;
    public int appetite;
    //Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
    //удалось покушать (хватило еды), сытость = true.
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness)
    {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate)
        {
        plate.decreaseFood(appetite);
        }
}

