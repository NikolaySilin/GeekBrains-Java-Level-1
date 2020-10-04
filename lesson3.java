package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class lesson3 {

    public static void main(String[] args) throws InterruptedException {
        guessTheNumber();

    }

    private static void guessTheNumber() throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
            int n = 0;
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);

                System.out.println("\nПривет, как тебя зовут?");
            String name = scanner.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Отлично " + name + ", сыграем с тобой в одну игру.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Тебе нужно будет отгадать случайное число.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Итак, начнем!");
                TimeUnit.SECONDS.sleep(1);

        while (count < 3 && guess != number) {
                System.out.println("Отгадай случайное число от 0 до 9.");
            guess = scanner.nextInt();
            if (number != guess);
                System.out.println("Ты " + ((guess > number) ? "угадал." : "не угадал."));
            count++;

        }
        System.out.println("\nТы " + ((guess == number)? "выйграл!!! " : "проиграл! : " + " и набрал " + number + " балла(ов)"));

            LOOP: while(true) {
                System.out.println("\nПопробуем еще разок? Да - 1, Нет - 0");
                n = scanner.nextInt();

                if (n == 0) {
                System.out.println("Ваше число: 0, выход из программы");
                break LOOP;
            } else if(n == 1);
                System.out.println("Ваше число: 1, перезапускаем программу.");
                TimeUnit.SECONDS.sleep(2);

                guessTheNumber();


            }
    }
}
