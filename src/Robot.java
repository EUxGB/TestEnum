public class Robot {
    private static int x;
    private static int y;
    private static Direction direction;


    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dX = robot.getX() - toX;
        int dY = robot.getY() - toY;
        //Direction startLook = robot.getDirection();
        if (dX < 0)  // нужно двигаться вправо
        {
            Direction endLook = Direction.RIGHT;
            while (robot.getDirection() != endLook) {
                robot.turnRight();
                System.out.println("Повернул направо");
            }

        }
        if (dX > 0)  // нужно двигаться влево
        {
            Direction endLook = Direction.LEFT;
            while (robot.getDirection() != endLook) {
                robot.turnLeft();
                System.out.println("Повернул налево");
            }


        }
        int i = 0;
        while (robot.getX() != toX) {
            robot.stepForward();
            i++;
            //System.out.println("Шаг");
        }
        System.out.println("Количество шагов вперед " + i);
        if (dY < 0) {  // нужно двигаться вверх
            Direction endLook = Direction.UP;
            while (robot.getDirection() != endLook) {
                robot.turnRight();
                System.out.println("Повернул направо");
            }


        }
        if (dY > 0)  // нужно двигаться вниз
        {
            Direction endLook = Direction.DOWN;
            while (robot.getDirection() != endLook) {
                robot.turnRight();
                System.out.println("Повернул направо");
            }


        }
        i = 0;
        while (robot.getY() != toY) {
            robot.stepForward();
            i++;
            // System.out.println("Шаг");
        }
        System.out.println("Количество шагов вперед " + i);
        return;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    // методы поворота робота
    public void turnLeft() {
        return ;
    }

    public void turnRight() {

        return;
    }

    public void stepForward() {

        return ;
    }


}
