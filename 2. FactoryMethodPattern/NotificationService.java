public class NotificationService {
    public static void main(String[] args) {
        FactoryCreator smsNotificationFactoryCreator = new SmsNotificationCreator();
        //ctrate a sms notification creator factory
        INotification smsNotification = smsNotificationFactoryCreator.factory();
        //create a sms notification
        smsNotification.sendNotification();

        FactoryCreator emailNotificationFactoryCreator = new EmailNotificationCreator();
        //create an email notification creator factory
        INotification emailNotification = emailNotificationFactoryCreator.factory();
        //create an email notification
        emailNotification.sendNotification();

        FactoryCreator pushNotificationFactoryCreator = new PushNotificationCreator();
        //create a push notification creator factory
        INotification pushNotification = pushNotificationFactoryCreator.factory();
        //create a push notification
        pushNotification.sendNotification();
        
    }
}
