public class TurnLeft implements Order {
    private Commands command;
    public TurnLeft(Commands command){
        this.command = command;
    }

    public void execute(){
        command.turnLeft();
    }
    
}
