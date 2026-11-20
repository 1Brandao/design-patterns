public class ProtectedImageProxy implements Image {
    private final Image image;
    private final boolean allowed;

    public ProtectedImageProxy(Image image, boolean allowed) {
        this.image = image;
        this.allowed = allowed;
    }

    @Override
    public void display() {
        if (!allowed) {
            System.out.println("Access denied");
            return;
        }
        image.display();
    }
}
