import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> gallery = List.of(new ImageProxy("forest.jpg"), new ImageProxy("beach.jpg"),
                new ImageProxy("mountain.jpg"));

        System.out.println("Gallery created");
        gallery.get(0).display();
        gallery.get(0).display();
        gallery.get(1).display();

        Image protectedImage = new ProtectedImageProxy(gallery.get(2), false);
        protectedImage.display();
    }
}
