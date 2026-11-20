import java.util.Objects;

public class ChatUser {
    private final String name;
    private final ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = Objects.requireNonNull(name, "name");
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name must not be empty");
        }
        this.mediator = Objects.requireNonNull(mediator, "mediator");
    }

    public final String getName() {
        return name;
    }

    boolean belongsTo(ChatMediator mediator) {
        return this.mediator == mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void sendPrivate(String recipientName, String message) {
        mediator.sendPrivate(message, this, recipientName);
    }

    public void receive(String senderName, String message) {
        System.out.println(name + " received from " + senderName + ": " + message);
    }
}
