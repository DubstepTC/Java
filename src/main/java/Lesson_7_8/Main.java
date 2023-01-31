package Lesson_7_8;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будет корма: ");
        int food = in.nextInt();
        Plate plate = new Plate(food);

        System.out.println("Сколько будет котов: ");
        int kol = in.nextInt();

        Cat[] Array_cat = new Cat[kol];

        for(int i = 0; i < kol; i++){
            System.out.println("\nИмя кота: ");
            String a = in.nextLine();
            String name = in.nextLine();
            System.out.println("Сколько кот съест: ");
            int appetite = in.nextInt();
            Array_cat[i] = new Cat(name,appetite);
        }

        while (true) {
            System.out.println("\n\nВыберите пункт ");
            System.out.println("[1] Покормить котов: ");
            System.out.println("[2] Пополнить миску: ");
            System.out.println("[3] Информация о котах: ");
            System.out.println("[4] Закртыть прогу: ");
            int point = in.nextInt();

            if (point == 1) {
                for (int j = 0; j < kol; j++) {
                    if (Array_cat[j].satiety == false) {
                        Array_cat[j].eat(plate);
                    }
                }
            }
            else if (point == 2) {
                System.out.println("В кормушке столько корма: " + plate.food);
                System.out.println("Сколько Добавите корма корма: ");
                int dob = in.nextInt();
                plate.poln(dob);
                System.out.println("В кормушке стало: " + plate.food);
            }
            else if (point == 3){
                for (int b = 0; b < kol; b++) {
                    System.out.println("\n\nКот: " + Array_cat[b].name + "\nСытость: " + Array_cat[b].satiety);
                }
            }
            else if (point == 4){
                break;
            }
        }
    }
}
