public class ClientCode  {
    public static void main(String[] args) {
        Commands commands = new Commands();

        WalkForward walkForward = new WalkForward(commands);
        WalkBackWord walkBackWord = new WalkBackWord(commands);
        Stop stop = new Stop(commands);
        TurnLeft turnLeft = new TurnLeft(commands);
        TurnRight turnRight = new TurnRight(commands);

        Robot robot = new Robot();
        robot.takeOrder(walkForward);
        robot.takeOrder(stop);
        robot.takeOrder(walkBackWord);
        robot.takeOrder(turnRight);
        robot.takeOrder(stop);
        robot.takeOrder(turnLeft);
        robot.takeOrder(walkBackWord);
        robot.takeOrder(stop);
        robot.takeOrder(walkForward);
        
        robot.placeOrders();
    }
}
