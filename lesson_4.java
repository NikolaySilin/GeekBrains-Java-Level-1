package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson_4 {

 private static final int SIZE_X = 5;
 private static final int SIZE_Y = 5;
 private static final char HUMAN = 'X'; // Фишка игрока.
 private static final char AI = 'O';    // Фишка ИИ.
 private static final char VOID = '.';  // Заполняем поле точками, типа пустые клетки).
 private static final int TRIUMPH = 5;

         private static char [][] battleField = new char[SIZE_Y][SIZE_X]; // Поле боя.

 private static Scanner scan = new Scanner(System.in);
 private static Random random = new Random();

         public static void main (String[] args ) {
            initField();                    // Инициализация поля.
            outputField();                  // Вывод поля.

            // В цикле.
            while (true) {
                stepMan();                  // Ход игрока.
                outputField();              // Вывод поля.
                if(checkVictory(HUMAN)) {   // Проверка на победу игрока.
                    System.out.println("Игрок победил");
                    break;
                }
                if (filledField()) {        // Пороверка на ничью.
                    System.out.println("Ничья");
                    break;
                }
                moveAI();                   // Ход ИИ.
                outputField();              // Вывод поля.
                if (checkVictory(AI)) {     // Проверка на победу ИИ.
                    System.out.println("Победил исскуственный разум");
                    break;
                }
                if (filledField()) {        // Проверка на ничью.
                    System.out.println("Ничья");
                }
            }
         }

 // Инициализация поля.
      private static void initField(){
      for (int i = 0; i < SIZE_Y; i++) {
         for (int j = 0; j < SIZE_X; j++) {
             battleField[i][j] = VOID;
         }
      }
   }

 // Вывод поля.
    public static void outputField() {

             /* for (int i = 0; i <= battleField.length; i++) {
             System.out.print(i + " ");
             }
             System.out.println();

        for (int i = 0; i < battleField.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < battleField[i].length; j++) {
                System.out.print(battleField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
            */

        for (int i = 0; i <= battleField.length; i++) {
            System.out.print(i + " ");
        }
          // System.out.println("\n____________");
        System.out.println();
        for (int i = 0; i < battleField.length; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < battleField[i].length; j++) {
                System.out.print(battleField[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

 // Ход игрока.
    public static void stepMan() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y. " + " К примеру  =)");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!hasCellValid(y, x));
         battleField[y][x] = HUMAN;
    }
 // Логика и ход ИИ.
    public static void moveAI() {
          int x;
          int y;
          do {
              x = random.nextInt(SIZE_X);
              y = random.nextInt(SIZE_Y);
          } while (!hasCellValid(y, x));
          battleField[y][x] = AI;
    }
 // Проверка хода.
       public static boolean hasCellValid(int y, int x) {
          if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
              return false;
          }
          return battleField[y][x] == VOID;
       }

    // Проверка по линии.
    private static boolean checkLine(int y, int x, int vy, int vx, char symb) {
        int wayX = x + (TRIUMPH - 1) * vx;
        int wayY = y + (TRIUMPH - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_X - 1 || wayY > SIZE_Y - 1) return  false;
        for (int i = 0; i < TRIUMPH; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (battleField[itemY][itemX] != symb) return false;
        }
        return true;
    }

    // Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    // Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.*
    // Очень желательно не делать это просто набором условий для каждой из возможных ситуаций.
    // Проверка на победу.
    private static boolean checkVictory(char symb) {
          for (int i = 0; i < SIZE_Y; i++) {
              for (int j = 0; j < SIZE_X; j++) {
                  if(checkLine(i, j, 0, 1, symb)) return true; // Проверка линии по X.
                  if(checkLine(i, j, 1, 0, symb)) return true; // Проверка линии по Y.
                  if(checkLine(i, j, 1, 1, symb)) return true; // Проверка по диагонали Х Y.
                 if(checkLine(i, j, -1, 1, symb)) return true; // Проверка по диагонали X -Y.
              }
          }
          return false;
    }

    // Проверка на ничью.
    public static boolean filledField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (battleField[i][j] == VOID) {
                    return false;
                }
            }
        }
        return true;
    }



}







