public  class Robot {
    private static int x ;
    private static int y ;
    private static Direction direction ;



    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
    public  Direction turnLeft(){
        int s = direction.ordinal();
        if (s == 0) s = 5;
        direction = direction.values()[s-1];
        return direction;
    }

    public  Direction turnRight(){
        int s = direction.ordinal();
        if (s == 4) s = -1;
        direction = direction.values()[s+1];
        return direction;
    }

    public void stepForward (){

        return;
    }



    public static int moveRobot(Robot robot, int toX, int toY) {

        int dX = toX - robot.getX();
        int dY = toY - robot.getY();
        int r = 0;

        Direction startLook = robot.getDirection();


        if (dX < 0)  // нужно двигаться вправо
        {
            Direction endLook = Direction.RIGHT;

            while (startLook!=direction){
                r++;
                startLook = robot.turnRight();

            }
        }
        if (dX < 0)  // нужно двигаться влево
        {

            Direction endLook = Direction.LEFT;
            while (startLook!=direction){
                startLook = robot.turnLeft();
                System.out.println("Повернул на лево");
            }

        }


        if (dY < 0)  // нужно двигаться вверх
        {

        }
        if (dY > 0)  // нужно двигаться вниз
        {

        }
        return r;

    }







}
