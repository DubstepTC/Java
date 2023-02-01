package Lesson9;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будет участников: ");
        int kol = in.nextInt();
        Actions[] Actions = new Actions[kol];
        int i = 0;

        while (i < kol){

            System.out.println("Выберете пункт: ");
            System.out.println("[1] Добавить человека: ");
            System.out.println("[2] Добавить робота: ");
            System.out.println("[3] Добавить кота: ");
            int point = in.nextInt();

            if(point == 1){
                System.out.println("\nИмя человека: ");
                String a = in.nextLine();
                String name = in.nextLine();
                System.out.println("Дистанция бега: ");
                Integer runDistance = in.nextInt();
                System.out.println("Высота прыжка: ");
                Integer jumpHeight = in.nextInt();

                Actions[i] = new Human(name,runDistance,jumpHeight);
                i +=1;
            }
            else if(point == 2){
                System.out.println("\nИмя робота: ");
                String a = in.nextLine();
                String name = in.nextLine();
                System.out.println("Дистанция бега: ");
                Integer runDistance = in.nextInt();
                System.out.println("Высота прыжка: ");
                Integer jumpHeight = in.nextInt();

                Actions[i] = new Bot(name,runDistance,jumpHeight);
                i +=1;
            }
            else if(point == 3){
                System.out.println("\nИмя кота: ");
                String a = in.nextLine();
                String name = in.nextLine();
                System.out.println("Дистанция бега: ");
                Integer runDistance = in.nextInt();
                System.out.println("Высота прыжка: ");
                Integer jumpHeight = in.nextInt();

                Actions[i] = new Cat(name,runDistance,jumpHeight);
                i +=1;
            }
        }
        System.out.println("\nСколько будет препядствий: ");
        int kol2 = in.nextInt();
        Barrier[] Barrier = new Barrier[kol2];
        int b = 0;

        while (b < kol2){
            System.out.println("Выберете пункт: ");
            System.out.println("[1] Добавить дорогу: ");
            System.out.println("[2] Добавить стену: ");
            int point = in.nextInt();

            if(point == 1){
                System.out.println("\nУкажите длину дороги: ");
                Integer length = in.nextInt();
                Barrier[b] = new Road("Дорога",length);
                b +=1;
            }
            else if(point == 2){
                System.out.println("\nУкажите высоту стены: ");
                Integer heigth = in.nextInt();
                Barrier[b] = new Wall("Стена",heigth);
                b +=1;
            }
        }
        for(int j = 0; j < kol; j++){
            boolean result = true;
            for(int l = 0; l < kol2; l++){
                result = Barrier[l].moving(Actions[j]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Пройдено");
            } else {
                System.out.println("Облажался");
            }
            }
        }
}

