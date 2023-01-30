package Lesson6;

public class Dog extends Animal{
    private static int count;

    public Dog(String type, String name, int swims, int goes, int run, int crawling) {
        this.type = type;
        this.name = name;
        this.flying = 0;
        if(run <= 10){
            this.run = run;
        }
        else {
            System.out.println("[Плаванье] собака сошла с дистанции на 10 м.");
            this.run = 10;
        }
        this.goes = goes;
        if(run <= 500){
            this.run = run;
        }
        else {
            System.out.println("[Бег] собака с дистанции на 500 м.");
            this.run = 500;
        }
        this.crawling = crawling;
        count++;
    }
    public static int getCount() {
        return count;
    }
}
