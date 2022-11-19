public class WalkBackWord implements Order {
    private Commands command;
    public WalkBackWord(Commands command){
        this.command = command;
    }
    public void execute(){
        command.goBackward();
    }        
}
