package Lesson6;

public class Cat extends Animal {
    private static int count;

    public Cat(String type, String name, int goes, int run, int crawling) {
        this.type = type;
        this.name = name;
        this.flying = 0;
        this.swims = 0;
        this.goes = goes;
        if(run <= 200){
            this.run = run;
        }
        else {
            System.out.println("[Бег] кошка сошла с дистанции на 200 м.");
            this.run = 200;
        }
        this.crawling = crawling;
        count++;
    }
    public static int getCount() {
        return count;
    }

}
