
public class Client {
    public static void main(String[] args) {
        
        
        //every time the printed value will be same because the object is created once and used many times
        for(int i = 0; i < 20; i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getRandomNumber());
        }

    }
}
