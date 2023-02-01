package Lesson9;

public class Wall extends Barrier {
    private int heigth;
    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }
    public int getHeigth() {
        return heigth;
    }
    protected boolean moving(Actions actions) {
        System.out.println("\n" + super.getName() + "высота: " + this.heigth);
        actions.jump();
        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Перепрыгнул");

            return true;
        } else {
            System.out.println("Не получилось перепрыгнуть");

            return false;
        }
    }
}