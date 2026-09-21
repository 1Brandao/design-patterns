// Component: the common abstraction shared by files (leaves) and folders
// (composites), so the client treats both the same way.
public interface FileSystemComponent {

    String getName();

    long getSize();

    // Additional challenge: prints the whole tree from any node.
    void display(String indent);

}
