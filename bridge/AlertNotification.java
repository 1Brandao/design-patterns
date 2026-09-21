// Refined abstraction: decides what the message looks like, not how it travels.
public class AlertNotification extends Notification {

    public AlertNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        sender.send("[ALERT] " + message);
    }
}
