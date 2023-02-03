package Lesson11;

import java.util.*;

public class main {
    public static void main(String[] args){

        String[] words = {"Зевс", "Аполлон", "Артемида", "Гермес ", "Артемида", "Артемида", "Зевс", "Гера", "Афродита", "Гестия"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");


        Phonebook pb = new Phonebook();

        pb.add("Ларкин", "+7(945)-645-74-54");
        pb.add("Лебачкин", "+7(743)-565-78-14");
        pb.add("Фролов", "+7(435)-565-24-35");
        pb.add("Тимошкин", "+7(345)-745-74-64");
        pb.add("Смирнов", "+7(785)-697-84-84");
        pb.add("Ларкин", "+7(456)-345-54-34");
        pb.add("Лебачкин", "+7(942)-545-64-14");


        System.out.println(pb.get("Лебачкин"));
    }

}
