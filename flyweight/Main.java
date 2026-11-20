import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeTypeFactory factory = new TreeTypeFactory();
        TreeType oak = factory.getTreeType("Oak", "Green", "oak");
        List<Tree> trees = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            double oakScale = i % 2 == 0 ? 0.5 : 2.0;
            trees.add(new Tree(i, i * 2, factory.getTreeType("Oak", "Green", "oak"), oakScale));
            trees.add(new Tree(i, i * 3 + 1, factory.getTreeType("Pine", "Dark green", "pine")));
        }

        for (Tree tree : trees) {
            tree.draw();
        }

        System.out.println("Trees: " + trees.size());
        System.out.println("Shared types: " + factory.getTypeCount());
        System.out.println("Same Oak type: " + (oak == factory.getTreeType("Oak", "Green", "oak")));
    }
}
