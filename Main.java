package ru.geekbrains.lesson_7;

public class Main
{

    public static void main(String[] args)
    {
        //Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        //и потом вывести информацию о сытости котов в консоль.
        Cat[] arrCats = new Cat[3];
        arrCats[0] = new Cat("Dusya", 7, false);
        arrCats[1] = new Cat("Busya", 15, false);
        arrCats[2] = new Cat("Tisha", 23, false);

        Plate plate = new Plate(34);
        plate.info();

        //Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
        //наполовину сыт (это сделано для упрощения логики программы).
        for (int i = 0; i < arrCats.length; i++)
        {
            if (arrCats[i].fullness == false && arrCats[i].appetite < plate.food)
            {
                arrCats[i].eat(plate);
                arrCats[i].fullness = true;
                System.out.println("Cat " + arrCats[i].name + " eat.");
            } else  // Если кто-нибудь не поел.
                {
                        System.out.println("Cat " + arrCats[i].name + " did not eat.");

                } if (arrCats[i].fullness == false)  // Повторная проверка на сытость котиков. Если хоть один кот голодный, то наполняем миску и кормим кота.
                    {
                        plate.increaseFood();
                        arrCats[i].eat(plate);
                        System.out.println("Cat " + arrCats[i].name + " eat.");
                    }

        }

        plate.info();

    }
}