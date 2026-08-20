public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("notificado por push: " + message);
    }
}
