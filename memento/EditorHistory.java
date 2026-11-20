import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class EditorHistory {
    private final TextEditor editor;
    private final Deque<TextEditor.EditorMemento> undoStack = new ArrayDeque<>();
    private final Deque<TextEditor.EditorMemento> redoStack = new ArrayDeque<>();

    public EditorHistory(TextEditor editor) {
        this.editor = Objects.requireNonNull(editor, "Editor is required");
    }

    public void backup() {
        undoStack.push(editor.save());
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("No edit to undo");
            return;
        }
        redoStack.push(editor.save());
        editor.restore(undoStack.pop());
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("No edit to redo");
            return;
        }
        undoStack.push(editor.save());
        editor.restore(redoStack.pop());
    }
}
