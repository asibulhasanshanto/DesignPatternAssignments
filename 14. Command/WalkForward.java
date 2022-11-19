public class WalkForward implements Order {
    private Commands command;
    public WalkForward(Commands command){
        this.command = command;
    }
    public void execute(){
        command.walkForward();
    }    
}
