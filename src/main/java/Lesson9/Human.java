package Lesson9;

public class Human implements Actions {
    private int runDistance;
    private int jumpHeight;
    public String name;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }


    public void run() {
        System.out.println("Человек - " + this.name + " побежал(а) " + this.getRunDistance());
    }

    public void jump() {
        System.out.println("Человек - " + this.name + " прыгнул(а) " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
