public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory(editor);
        editor.setText("Hello");
        editor.setCursorPosition(2);

        history.backup();
        editor.setText("Hello, world!");
        editor.setCursorPosition(5);
        history.backup();
        editor.setText("Goodbye");

        history.undo();
        printState("Undo", editor);
        history.undo();
        printState("Undo", editor);
        history.undo();

        history.redo();
        printState("Redo", editor);
        history.undo();
        printState("Undo", editor);
        history.backup();
        editor.setText("Hello again!");
        history.redo();
        printState("New edit preserved", editor);
    }

    private static void printState(String action, TextEditor editor) {
        System.out.printf("%s: %s (cursor: %d)%n", action, editor.getText(), editor.getCursorPosition());
    }
}
