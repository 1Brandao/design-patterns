public class Main {
    public static void main(String[] args) {
        Light livingRoom = new Light("Living room");
        Light kitchen = new Light("Kitchen");
        RemoteControl remote = new RemoteControl();
        remote.setCommand("room-on", new TurnOnLightCommand(livingRoom));
        remote.setCommand("room-off", new TurnOffLightCommand(livingRoom));
        remote.setCommand("kitchen-on", new TurnOnLightCommand(kitchen));

        remote.pressButton("room-on");
        remote.pressButton("room-off");
        remote.pressButton("kitchen-on");
        printStates(livingRoom, kitchen);

        remote.setCommand("room-on", new TurnOffLightCommand(kitchen));
        remote.pressButton("room-on");
        printStates(livingRoom, kitchen);
        remote.pressButton("unknown");

        System.out.println("Undo turning on a light that was off:");
        remote.pressButton("kitchen-on");
        remote.undoLast();
        printStates(livingRoom, kitchen);

        System.out.println("Undo turning on a light that was already on:");
        remote.pressButton("kitchen-on");
        remote.pressButton("kitchen-on");
        remote.undoLast();
        printStates(livingRoom, kitchen);
        remote.undoLast();
    }

    private static void printStates(Light livingRoom, Light kitchen) {
        System.out.println("Living room on: " + livingRoom.isOn() + "; kitchen on: " + kitchen.isOn());
    }
}
