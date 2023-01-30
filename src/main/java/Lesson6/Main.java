package Lesson6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько животных вы хотите добавить?");
        int kol = in.nextInt();
        Animal[] animals = new Animal[kol];

        for(int i = 0; i < kol; i++){
            System.out.println("\nКого хотитие добавить?");
            System.out.println("[1] Cat");
            System.out.println("[2] Dog");
            int num = in.nextInt();

            if(num == 1){
                System.out.println("\nВведте кличку");
                String Full_name = in.nextLine();
                String name2 = in.nextLine();
                System.out.println("Сколько прошла");
                int goes = in.nextInt();
                System.out.println("Сколько пробежала");
                int run = in.nextInt();
                System.out.println("Сколько проползла");
                int crawling = in.nextInt();
                System.out.println("\n");
                animals[i] = new Cat("Cat", name2, goes, run, crawling);
            }
            else if (num == 2){
                System.out.println("\nВведте кличку");
                String Full_name = in.nextLine();
                String name2 = in.nextLine();
                System.out.println("Сколько прошла");
                int goes = in.nextInt();
                System.out.println("Сколько проплыла");
                int swim = in.nextInt();
                System.out.println("Сколько пробежала");
                int run = in.nextInt();
                System.out.println("Сколько проползла");
                int crawling = in.nextInt();
                System.out.println("\n");
                animals[i] = new Dog("Dog", name2, swim, goes, run, crawling);
            }
        }
        System.out.println("\nИнформация о животных");
        System.out.println("Количество животных: " + Animal.getCount());
        System.out.println("Cat: " + Cat.getCount());
        System.out.println("Dog: " + Dog.getCount() + "\n");

        for(int j = 0; j < kol; j ++){
            System.out.println(animals[j]);

        }

    }
}
