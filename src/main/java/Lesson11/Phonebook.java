package Lesson11;

import java.util.*;
public class Phonebook {
    private Map<String, HashSet<String>> map;
    Phonebook() {
        this.map = new HashMap<>();
    }
    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }
    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}
