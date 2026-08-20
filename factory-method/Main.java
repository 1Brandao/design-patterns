public class Main {

    public static void main(String[] args) {

        // A lógica principal só conhece a abstração NotificationFactory.
        // Nenhuma classe concreta de notificação é referenciada aqui.
        NotificationFactory[] factories = {
                new EmailNotificationSubClass(),
                new SmsNotificationSubClass(),
                new PushNotificationSubClass(),
        };

        for (NotificationFactory factory : factories) {
            factory.sendNotification("Your order has been shipped!");
            System.out.println();
        }
    }
}