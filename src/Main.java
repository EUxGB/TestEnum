

public class Main {


    public static void main(String[] args) {

        Robot Stepic = new Robot( -1, 5, Direction.UP);
        System.out.println("Начальное положение робота");
        System.out.println(Stepic.getDirection());
        System.out.println(Stepic.getX() + "   " +Stepic.getY());
        System.out.println("*************************");
        Robot.moveRobot(Stepic, 15, 1);

        System.out.println("**********************************");
        System.out.println("Конечное положение робота");
        System.out.println(Stepic.getDirection());
        System.out.println(Stepic.getX() + "   " +Stepic.getY());

    }
}
