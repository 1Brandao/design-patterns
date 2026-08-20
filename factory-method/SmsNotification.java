public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("notificado por sms: " + message);
    }
}
