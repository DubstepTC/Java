package Lesson_7_8;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void poln(int k) {
        this.food = this.food + k;
    }

    public boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
