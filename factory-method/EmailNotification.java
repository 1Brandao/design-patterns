public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("notificado por email: " + message);
    }
}
