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
        Direction startLook = robot.getDirection();
        if (dX < 0)  // нужно двигаться вправо
        {
            Direction endLook = Direction.RIGHT;
            while (startLook != endLook) {
                startLook = robot.turnRight();
                System.out.println("Повернул направо");
            }

        }
        if (dX > 0)  // нужно двигаться влево
        {
            Direction endLook = Direction.LEFT;
            while (startLook != endLook) {
                startLook = robot.turnLeft();
                System.out.println("Повернул налево");
            }


        }
        int i = 0;
        while (x != toX) {
            robot.stepForward();
            i++;
            //System.out.println("Шаг");
        }
        System.out.println("Количество шагов вперед " + i);
        if (dY < 0) {  // нужно двигаться вверх
            Direction endLook = Direction.UP;
            while (startLook != endLook) {
                startLook = robot.turnRight();
                System.out.println("Повернул направо");
            }


        }
        if (dY > 0)  // нужно двигаться вниз
        {
            Direction endLook = Direction.DOWN;
            while (startLook != endLook) {
                startLook = robot.turnRight();
                System.out.println("Повернул направо");
            }


        }
        i = 0;
        while (y != toY) {
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
    public Direction turnLeft() {
        int s = direction.ordinal();
        if (s == 0) s = 4;
        direction = direction.values()[s - 1];
        return direction;
    }

    public Direction turnRight() {
        int s = direction.ordinal();
        if (s == 3) s = -1;
        direction = direction.values()[s + 1];
        return direction;
    }

    public int stepForward() {
        Direction fDirection = getDirection();
        if (fDirection == Direction.UP) {
            y++;
            return y;
        }
        if (fDirection == Direction.DOWN) {
            y--;
            return y;
        }
        if (fDirection == Direction.RIGHT) {
            x++;
            return x;
        }
        if (fDirection == Direction.LEFT) {
            x--;
            return x;
        }
        return 0;
    }


}
