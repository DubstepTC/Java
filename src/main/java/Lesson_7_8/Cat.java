package Lesson_7_8;

public class Cat {
    public String name;
    public int appetite;
    public int hung;
    public boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
        this.hung = 1;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite) == true){
            sat();
        };
    }
    public void sat() {
        this.satiety = true;
    }
}
