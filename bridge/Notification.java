// Abstraction: keeps a reference to the implementor (the bridge) and never
// depends on a concrete channel such as EmailSender or SmsSender.
public abstract class Notification {

    protected final NotificationSender sender;

    protected Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notify(String message);

}
