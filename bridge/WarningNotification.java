// Additional challenge: a new type added without touching the channels.
public class WarningNotification extends Notification {

    public WarningNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        sender.send("[WARNING] " + message);
    }
}
