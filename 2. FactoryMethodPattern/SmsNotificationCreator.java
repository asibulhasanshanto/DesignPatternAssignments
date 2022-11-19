public class SmsNotificationCreator extends FactoryCreator {
    @Override
    public INotification factory() {
        return new SmsNotification();
    }
}