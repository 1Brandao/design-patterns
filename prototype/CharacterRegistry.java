import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Prototype registry: stores the ready-made models and hands out copies.
// The client asks for "Warrior" and never touches a constructor.
public class CharacterRegistry {

    private final Map<String, Character> prototypes = new HashMap<>();

    public CharacterRegistry() {
        prototypes.put("Warrior", new Character(
                "Warrior Model", "Warrior", 100, 30, 20, "Sword",
                List.of("Slash", "Shield Block")
        ));

        prototypes.put("Mage", new Character(
                "Mage Model", "Mage", 70, 45, 10, "Staff",
                List.of("Fireball", "Teleport")
        ));

        prototypes.put("Archer", new Character(
                "Archer Model", "Archer", 80, 35, 15, "Bow",
                List.of("Precise Shot", "Dodge")
        ));
    }

    public Character create(String type) {
        Character prototype = prototypes.get(type);

        if (prototype == null) {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }

        return prototype.clonePrototype();
    }
}
