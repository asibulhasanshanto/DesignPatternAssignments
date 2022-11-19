public class TurnRight implements Order {
    private Commands command;
    public TurnRight(Commands command){
        this.command = command;
    }
    public void execute(){
        command.turnRight();
    }
}
