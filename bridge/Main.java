public class Main {

    public static void main(String[] args) {

        NotificationSender email = new EmailSender();
        NotificationSender sms = new SmsSender();

        // Any type can be combined with any channel at runtime.
        new AlertNotification(email).notify("Your account was accessed from a new device.");
        new AlertNotification(sms).notify("Your account was accessed from a new device.");
        new ReminderNotification(email).notify("Your appointment starts in one hour.");
        new ReminderNotification(sms).notify("Your appointment starts in one hour.");

        System.out.println();

        // Additional challenge: one new channel and one new type, no existing
        // class changed. Three types x three channels, still six classes.
        NotificationSender whatsApp = new WhatsAppSender();

        new WarningNotification(whatsApp).notify("Your storage is almost full.");
        new ReminderNotification(whatsApp).notify("Your invoice is due tomorrow.");
        new WarningNotification(email).notify("Your password expires in 3 days.");
    }
}
