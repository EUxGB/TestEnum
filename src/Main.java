import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {

        Robot Stepic = new Robot( 1, 3, Direction.LEFT);

        int n = Robot.moveRobot(Stepic, 10, 7);
        System.out.println("шагов по оси X" + "\n" + "шагов по оси Y");
        System.out.println("повернул направо " + n+ "раз");


    }
}
