public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;
    private final double scale;

    public Tree(int x, int y, TreeType type) {
        this(x, y, type, 1.0);
    }

    public Tree(int x, int y, TreeType type, double scale) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.scale = scale;
    }

    public void draw() {
        type.draw(x, y, scale);
    }
}
