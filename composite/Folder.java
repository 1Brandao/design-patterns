import java.util.ArrayList;
import java.util.List;

// Composite: holds other components, which may be files or other folders.
// The size is the recursive sum of its children; an empty folder returns zero.
public class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public Folder add(FileSystemComponent component) {
        children.add(component);
        return this;
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    // No instanceof and no type check: every child answers getSize() on its own.
    @Override
    public long getSize() {
        long total = 0;
        for (FileSystemComponent child : children) {
            total += child.getSize();
        }
        return total;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name + "/ (" + getSize() + " KB)");
        for (FileSystemComponent child : children) {
            child.display(indent + "    ");
        }
    }
}
