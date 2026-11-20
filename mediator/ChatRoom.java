import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ChatRoom implements ChatMediator {
    private final Map<String, ChatUser> participants = new LinkedHashMap<>();

    @Override
    public void register(ChatUser user) {
        Objects.requireNonNull(user, "user");
        if (!user.belongsTo(this)) {
            System.out.println("Registration refused: user belongs to another mediator");
            return;
        }

        ChatUser existing = participants.putIfAbsent(user.getName(), user);
        if (existing != null && existing != user) {
            System.out.println("Registration refused: name already in use");
        }
    }

    @Override
    public void send(String message, ChatUser sender) {
        if (!validateSender(sender)) {
            return;
        }

        for (ChatUser user : participants.values()) {
            if (user != sender) {
                user.receive(sender.getName(), message);
            }
        }
    }

    @Override
    public void sendPrivate(String message, ChatUser sender, String recipientName) {
        if (!validateSender(sender)) {
            return;
        }

        ChatUser recipient = participants.get(recipientName);
        if (recipient == null) {
            System.out.println("Message refused: recipient not found");
        } else if (recipient == sender) {
            System.out.println("Message refused: sender cannot be the recipient");
        } else {
            recipient.receive(sender.getName(), message);
        }
    }

    private boolean validateSender(ChatUser sender) {
        if (sender != null && participants.get(sender.getName()) == sender) {
            return true;
        }
        System.out.println("Message refused: sender is not registered");
        return false;
    }
}
