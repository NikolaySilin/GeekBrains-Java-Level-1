package ru.geekbrains.lesson_5;

public class Main {

    public static void main(String[] args) {

        // Создать массив из 5 сотрудников.
        Employee[] persArray = new Employee[6];
        persArray[0] = new Employee("Кришталь Владимир", "Инженер", "krishtal@mail.ru", "89231231291", 78000, 32);
        persArray[1] = new Employee("Зарипов Евгений", "Бухгалтер", "Zaripor@mail.ru" ,"89231231292", 100000, 36);
        persArray[2] = new Employee("Громов Григорий", "Охранник", "Gromov@mail.ru" ,"89231231293", 30000, 56);
        persArray[3] = new Employee("Максимов Алексей", "Разработчик Java", "Maksimov@mail.ru" ,"89231231294", 180000, 29);
        persArray[4] = new Employee("Петров Александр", "Архитектор ПО", "Petrov@mail.ru" ,"89231231295", 220000, 43);
        persArray[5] = new Employee("Миллер Алексей", "Стажер junior Java/Kotlin ", "Miller@mail.ru", "89231231299", 25000, 17);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Сотрудники старше 40 лет: ");
        for (Employee obj1 : persArray) {
            if (obj1.itAge() > 40) obj1.outputInfo();
        }

        System.out.println("\nСотрудники младше 40 лет: ");
        for (Employee obj2 : persArray) {
            if (obj2.itAge() < 40 && obj2.itAge() > 20) obj2.outputInfo();
        }

        System.out.println("\nСотрудники младше 18 лет: ");
        for (Employee obj3 : persArray) {
            if (obj3.itAge() < 18) obj3.outputInfo();
        }
    }
}



