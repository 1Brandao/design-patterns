public abstract class NotificationFactory {

    // Factory Method: as subclasses decidem qual notificação concreta será criada.
    public abstract Notification createNotification();

    // Lógica de negócio: trabalha apenas com a abstração Notification.
    public void sendNotification(String message) {
        System.out.println("enviando notificação...");

        Notification notification = createNotification();

        notification.send(message);

        System.out.println("notificação realizada!");
    }
}
