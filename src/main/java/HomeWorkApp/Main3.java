package HomeWorkApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
//        point1();
//        point2();
//        point3();
//        point4();
//        point5();
//        point6();
//        System.out.println(point7());
        point8();
    }
    public static void point1() {
       int[] arr = new int[10];
       for(int i = 0; i < 10; i++){
           arr[i] = (int) (Math.random() * 2);
       }
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 10; i++){
            if (arr[i] == 0 ){
                arr[i] = 1;
            }
        }
        System.out.println("Изменили массив");
        System.out.println(Arrays.toString(arr));
    }
    public static void point2(){
        int[] arr = new int[101];
        for(int i = 0; i < 101; i++){
            arr[i] = i;
        }
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr));
    }
    public static void point3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 12; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Изменили массив");
        System.out.println(Arrays.toString(arr));
    }
    public static void point4(){
        char[][] table = new char[11][11];
        for(int i = 0; i < table.length; i++){
            for(int p = 0; p < table.length; p++){
                if (i == p || i + p == 10) {
                    table[i][p] = '1';
                } else {
                    table[i][p] = ' ';
                }
                System.out.print(table[i][p] + " ");
            }
            System.out.println();
        }
    }
    public static void point5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = in.nextInt();
        System.out.println("Введите значение, которыми хотите заполнить массив");
        int initialValue = in.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));

    }
    public static void point6(){
        Integer[] arr1 = new Integer[15];
        for(int i = 0; i < 15; i++){
            arr1[i] = (int) (Math.random() * 100);
        }
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Максимальное значение в массиве: " + Collections.max(Arrays.asList(arr1)));
        System.out.println("Минимальное значение в массиве: " + Collections.min(Arrays.asList(arr1)));
    }
    public static boolean point7(){
        Integer[] arr2 = new Integer[15];
        for(int i = 0; i < 15; i++){
            arr2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr2));


        int right = 0;
        int left = 0;
        for(int i = 0; i < arr2.length - 1; i++) {
            left += arr2[i];
            for (int j = i + 1; j < arr2.length; j++) {
                right += arr2[j];
            }
            if (left == right) {
                return true;
            }
            right = 0;
        }
        return  false;
    }

    public static void point8(){
        Integer[] arr = new Integer[15];
        for(int i = 0; i < 15; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Получили такой массив");
        System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число сдвига");
        int sd = in.nextInt();

        if (sd > 0){
            for (int i = 0; i < sd; i++) {
                int buffer = arr[arr.length - 1];
                System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = buffer;
            }
        } else if (sd < 0) {
        for (int i = 0; i < -sd; i++) {
            int buffer = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = buffer;
        }
        }
        System.out.println("Изменили массив");
        System.out.println(Arrays.toString(arr));
    }
}




