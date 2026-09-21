// Implementor: the sending channel, which varies independently from the
// notification type.
public interface NotificationSender {

    void send(String message);

}
