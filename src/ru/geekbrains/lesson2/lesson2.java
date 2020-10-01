package ru.geekbrains.lesson2;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        replacezeroArray();
        System.out.println("\nЗадание 2");
        eightArray();
        System.out.println("\nЗадание 3");
        cycleArray();
        System.out.println("\nЗадание 4");
        fillDiagonal();
        System.out.println("\nЗадание 5");
        minMax();

    }
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0.

    public static void replacezeroArray() {
        int[] integerArray = new int[]{0, 1, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 0) integerArray[i] = 1;
            else integerArray[i] = 0;
            System.out.print(integerArray[i]);

        }



    }

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.

    public static void eightArray() {
        int[] emptyArr = new int[8];
        for (int i = 0, j = 0; i < emptyArr.length; i++, j += 3) {
            emptyArr[i] = j;
            System.out.print(j);
        }
    }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.

        public static void cycleArray() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) arr[i] *= 2;
                System.out.print(arr[i]);
            }
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами.

        public static void fillDiagonal() {
            int n = 6;
            int[][] sqare = new int[n][n];
            //int[][] sqare = new int[6][6];
            for (int i = 0; i < sqare.length; i++) {
                sqare[i][i] = 1;
                sqare[i][n - i - 1] = 1;
                //sqare [i][6 - i - 1] = 1;
                System.out.println(Arrays.toString(sqare[i]));
            }
        }

        //5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)

        public static void minMax() {
        int[] oneArr = { 2 , 3, 12, 8, 16, 9, 177 };
            int max = oneArr[0];
            for (int i = 1; i < oneArr.length; i++) max = Math.max(max, oneArr[i]);
            System.out.println("Maximum " + max);
            int min = oneArr [0];
            for (int j = 1; j < oneArr.length; j++) min = Math.min(min, oneArr[j]);
            System.out.println("Minimum " + min);
                }



        }










