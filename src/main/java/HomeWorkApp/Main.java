package HomeWorkApp;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign();
//          printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\n"+ "Banana\n"+ "Apple");
    }
    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a + b < 0){
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }
    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int value = in.nextInt();
        if ( value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a2 = in.nextInt();
        System.out.println("Введите второе число");
        int b2 = in.nextInt();
        if(a2 >= b2 ){
            System.out.println("a >= b");
        } else if (a2 < b2) {
            System.out.println("a < b");
        }
    }
}
