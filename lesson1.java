package ru.geekbrains;

/*

Николай Силин
Домашнее задание к уроку 1.

 */



public class lesson1 {

        public static void main(String[] args) {
            taskOne();
            System.out.println(taskTwo(3,8,2,1));
            System.out.println(taskThree(7,13));
            taskFour(10);
            System.out.println(taskFive(14));
            taskSix("Джон");
            taskSeven(2020);
            taskEight(2021);
        }

        public static void taskOne() {
            System.out.println("Задание 1.");
            // Создать переменные всех пройденных типов данных, и инициализировать их значения

            // Целочисленные
            byte iByte = 2;
            short iShort = 18000;
            int iInt = 99000;
            long iLong = 132000;

            // С плавающей запятой
            float x = 320.0f;                                                  // В конце значения всегда пишется суффикс f
            double p = 921.123;

            // Cимвольные
            char o = 't';                                                      // Одинарные ковычки ' '

            // Строковые
            String text = new String("Здесь будет текcт");              // Двойные ковычки " "

            // Логические
            boolean r = true;                                                  // Только два варианта true или false

            System.out.println("Значение byte = " + iByte);
            System.out.println("Значение short = " + iShort);
            System.out.println("Значение int = " + iInt);
            System.out.println("Значение long = " + iLong);
            System.out.println("Значение float = " + x);
            System.out.println("Значение double = " + p);
            System.out.println("Значение char = " + o);
            System.out.println("Значение String = " + text);
            System.out.println("Значение boolean = " + r);
        }
        // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        // где a, b, c, d – входные параметры этого метода

    static double taskTwo(double a, double b, double c, double d) {
        System.out.println("\nЗадание 2.");
            return a *(b + (c / d));
        }
        // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно)
        // если да – вернуть true, в противном случае – false

    static boolean taskThree(int a, int b) {
        System.out.println("\nЗадание 3.");
           int c = a + b;
           if(c > 10 && 20 > c) return true;
           else return false;
        }
        // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное
        // Замечание: ноль считаем положительным числом

    static void taskFour(int a) {
        System.out.println("\nЗадание 4.");
            if (a >= 0) System.out.println("Число " + a + " Положительное" );
            else System.out.println("Число " + a + " Отрицательное");
        }
        // Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное

    static boolean taskFive(int a) {
        System.out.println("\nЗадание 5.");
            if (a > 0) return true;
            else return false;
        }
        // Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»

    static void taskSix(String name) {
        System.out.println("\nЗадание 6.");
        System.out.println("Привет " + name);
    }
        // Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

    static void taskSeven(int year) {
        System.out.println("\nЗадание 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " - г. не високосный");
        else System.out.println(year + " - г. високосный");
    }
    // А можно и так =) с использованием условного оператора
    // ( логическое-выражение ) ? если-истина-возвращаем-это : если-ложь-возвращаем-это;
    // взял из книги Майка МакГрата программирование для начинающих
    static void taskEight(int year) {
        System.out.println("\nБонус");
            String result;
            result = (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) ? " г. не високосный" : " г. високосный" ;
        System.out.println(year + " -" + result);
    }
    }
