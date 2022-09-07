
public class EmailNotificationCreator extends FactoryCreator {
    @Override
    public INotification factory() {
        return new EmailNotification();
    }
    
}
