public class Main {
    public static void main(String[] args) {
        ChatMediator room = new ChatRoom();
        ChatUser ana = new ChatUser("Ana", room);
        ChatUser bruno = new ChatUser("Bruno", room);
        ChatUser carla = new ChatUser("Carla", room);
        ChatUser diego = new ChatUser("Diego", room);

        room.register(ana);
        room.register(bruno);
        room.register(carla);
        room.register(bruno);
        ana.send("Hello, everyone!");

        diego.send("Can anyone see this?"); // Diego is not yet registered.
        room.register(diego);
        bruno.send("Welcome, Diego!");

        room.register(new ChatUser("Ana", room)); // Refused: name already in use.
        ana.sendPrivate("Carla", "Can we talk?");
        ana.sendPrivate("Nobody", "Are you there?");
        ana.sendPrivate("Ana", "Note to myself");
    }
}
