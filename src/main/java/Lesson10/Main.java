package Lesson10;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Какой массив вы хотите создать ");
        System.out.println("Укажите кол-во строк: ");
        int line= in.nextInt();
        System.out.println("Укажите кол-во колонок: ");
        int column = in.nextInt();

        String[][] array = new  String[line][column];

        System.out.println("\nЗаполните массив");
        for(int i = 0; i < line; i++){
            for(int j = 0; j < column; j++){
                System.out.println("Укажите значение" );
                array[i][j] = in.next();
            }
        }

        try {
            try {
                int result = method(array);
                System.out.println("\n Сумма массива равна: " + result);
            } catch (MyArraySizeException e) {
                System.out.println("\nРазмер массива не подходит(нужен массив 4х4)");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильный тип данных в массиве");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }


    }
    public static int method(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
       if (a.length != 4){
           throw new MyArraySizeException();
       }
       for (int i = 0; i < a.length; i ++) {
           if (a[i].length != 4) {
               throw new MyArraySizeException();
           }
           for (int j = 0; j < a[i].length; j++) {
               try{
                    count = count + Integer.parseInt(a[i][j]);
               }
               catch (NumberFormatException e) {
                   throw new MyArrayDataException(i,j);
               }
           }
       }
       return count;
    }


}
