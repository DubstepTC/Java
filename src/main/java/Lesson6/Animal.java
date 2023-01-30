package Lesson6;

public class Animal {
    String name;
    String type; // вид животного
    int flying; // возможность животного летать
    int swims; // возможность животного плавать
    int goes; // возможность животного ходить
    int run; // возможность животного бегать
    int crawling; // возможность животного ползать
    private static int count; // счетчик количества созданных животных
    public Animal() {
        count++;
    }
    public  static int getCount(){
        return count;
    }
    public String toString() {
        return "Вид/порода: " + type + '\n' +
                "Кличка: " + name + '\n' +
                "Пролетела " + flying + "м. " + '\n' +
                "Проплыла " + swims + "м. " + '\n' +
                "Прошла " + goes + "м. " + '\n' +
                "Пробежала " + run + "м. " + '\n' +
                "Проползла " + crawling + "м. \n";
    }

}
