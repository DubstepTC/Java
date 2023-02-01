package Lesson9;

public class Cat implements Actions {
    private int runDistance;
    private int jumpHeight;
    public String name;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }


    public void run() {
        System.out.println("Кот - " + this.name + " побежал " + this.getRunDistance());
    }

    public void jump() {
        System.out.println("Кот - " + this.name + " прыгает " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
