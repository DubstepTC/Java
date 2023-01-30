package HomeWorkApp;

import java.io.IOException;
import java.util.Scanner;
public class Worker {
    public String full_name;
    public String position;
    public String email;
    public String phone;
    public Integer salary;
    public Integer age;

    // Это конструктор класса Worker в который пользователь сам может вносить данные
    public Worker(String full_name, String position, String email, String phone, Integer salary, Integer age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Введен некорректная зарплата");
        }
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }

    }
    public static void main(String[] args) throws IOException {

        Worker[] workArray = new Worker[5];

        for (int i = 0; i < 5; i ++){
            Scanner in = new Scanner(System.in);
            System.out.println("Введте ФИО");
            String full_name = in.nextLine();
            System.out.println("Введте должность");
            String position = in.nextLine();
            System.out.println("Введте почту");
            String email = in.nextLine();
            System.out.println("Введте телефон");
            String phone = in.nextLine();
            System.out.println("Введте Зарплату");
            Integer salary = in.nextInt();
            System.out.println("Введте возраст");
            Integer age = in.nextInt();
            workArray[i] = new Worker(full_name, position, email, phone, salary, age);

            System.out.println(
                    "\n\n\nСотрудник был записан в базу данных\n" +
                            "Сотрудник " + i +
                            "\nФИО - " + workArray[i].full_name +
                            "\nДолжность - " + workArray[i].position +
                            "\nПочта - " + workArray[i].email+
                            "\nТелефон - " +  workArray[i].phone +
                            "\nЗарплата - " +  workArray[i].salary +
                            "\nВозраст - " +  workArray[i].age + "\n\n");
        }


        System.out.println("\n\n\n\n\n Выведем информацию о сотрудниках старше 40 лет");
        for(int j = 0; j < 5; j++){
            if(workArray[j].age > 40){
                System.out.println(
                                "\nФИО - " + workArray[j].full_name +
                                "\nДолжность - " + workArray[j].position +
                                "\nПочта - " + workArray[j].email+
                                "\nТелефон - " +  workArray[j].phone +
                                "\nЗарплата - " +  workArray[j].salary +
                                "\nВозраст - " +  workArray[j].age);
            }
        }
    }
}


