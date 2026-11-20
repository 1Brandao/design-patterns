import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private record Key(String name, String color, String textureId) {}

    private final Map<Key, TreeType> types = new HashMap<>();

    public TreeType getTreeType(String name, String color, String textureId) {
        return types.computeIfAbsent(new Key(name, color, textureId),
                key -> new TreeType(key.name(), key.color(), loadTexture(key.textureId())));
    }

    public int getTypeCount() {
        return types.size();
    }

    private byte[] loadTexture(String textureId) {
        // The demo uses a placeholder for each requested texture asset.
        return new byte[100_000];
    }
}
