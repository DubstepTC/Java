package Lesson9;

public class Bot implements Actions{

    private int runDistance;
    private int jumpHeight;
    public String name;

    public Bot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }


    public void run() {
        System.out.println("Робот - " + this.name + " побежал " + this.getRunDistance());
    }

    public void jump() {
        System.out.println("Робот - " + this.name + " прыгнул " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
