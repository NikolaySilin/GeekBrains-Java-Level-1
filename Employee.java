package ru.geekbrains.lesson_5;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String mobilePhoneNum;
    private int wage;
    private int age;

    Employee(String fullName, String position, String email, String mobilePhoneNum, int wage, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.mobilePhoneNum = mobilePhoneNum;
        this.wage = wage;
        this.age = age;
    }
        int itAge() {
            return age;
        }

        // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        void outputInfo() {
            System.out.println("ФИО: " + fullName + " / " + " Должность: " + position + " / " + " Эл.почта: " + email + " / " + " Тел.: " + mobilePhoneNum + " / " + " Зарплата: " + wage + " / " + " Возраст: " + age);
        }

    }
