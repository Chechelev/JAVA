package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // объявляем сканнер
        System.out.println("Введите размер вашего массива");

        int arrSize = scanner.nextInt();
        int array[] = new int[arrSize];

        System.out.println("Введите элементы вашего массива");
        for (int  i = 0; i < arrSize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введенный массив:" + " " + Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int  i = 0; i < arrSize; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент:" + " " + min);
        System.out.println("Максимальный элемент:" + " " + max);

        //лаба 2

        Scanner scanner2 = new Scanner(System.in); // объявляем сканнер
        System.out.println("Введите размер вашего массива");

        int arrSize2 = scanner2.nextInt();
        int array2[] = new int[arrSize2];

        System.out.println("Введите элементы вашего массива");
        for (int  i = 0; i < arrSize2; i++) {
            array2[i] = scanner2.nextInt();
        }

        System.out.println("Введенный массив:" + " " + Arrays.toString(array2));

        int array3[] = new int[arrSize2];
        System.out.println("Массив в обратном порядке");
        for (int  i = 0; i < array2.length; i++) {
            array3[arrSize2 - 1 - i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("Элементы массива в обратном порядке");
        for (int  i = array2.length - 1; i >= 0; i--) {
            System.out.println(i+1 + " элемент: " + array2[i]);
        }
    }

}
