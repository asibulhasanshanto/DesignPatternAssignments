
public class PushNotificationCreator extends FactoryCreator {
    @Override
    public INotification factory() {
        return new PushNotification();
    }
    
}
