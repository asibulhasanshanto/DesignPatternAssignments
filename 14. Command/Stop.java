public class Stop implements Order {
    private Commands command;
    public Stop(Commands command){
        this.command = command;
    }
    public void execute(){
        command.stop();
    }   
}
