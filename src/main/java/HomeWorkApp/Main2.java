package HomeWorkApp;

import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
//        System.out.println(method1());
//        method2();
//        System.out.println(method3());
//        method4();
        System.out.println(method5());
    }
    public static boolean method1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        return a + b >= 10 && b + a <= 20;
    }
    public static void method2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a1 = in.nextInt();
        System.out.println(a1 >= 0 ? "Positive\n" : "Negative\n");
    }
    public static boolean method3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a2 = in.nextInt();
        return a2 >= 0;
    }
    public static void method4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строчку");
        String str = in.nextLine();
        System.out.println("Введите число");
        int ch = in.nextInt();
        for (int i = 0; i < ch; i ++){
            System.out.println(str);
        }
    }
    public static boolean method5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
