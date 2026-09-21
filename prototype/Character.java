import java.util.ArrayList;
import java.util.List;

// Concrete prototype: knows how to copy itself, so new characters are created
// from an existing model instead of receiving every attribute again.
public class Character implements Prototype<Character> {

    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;
    private String weapon;

    // Additional challenge: the list of skills must not be shared between copies.
    private List<String> skills;

    public Character(
            String name,
            String type,
            int health,
            int attack,
            int defense,
            String weapon,
            List<String> skills
    ) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.weapon = weapon;
        this.skills = new ArrayList<>(skills);
    }

    // Copy constructor used by the cloning operation.
    // The skills list is rebuilt (deep copy) so the clone owns its own collection.
    private Character(Character prototype) {
        this.name = prototype.name;
        this.type = prototype.type;
        this.health = prototype.health;
        this.attack = prototype.attack;
        this.defense = prototype.defense;
        this.weapon = prototype.weapon;
        this.skills = new ArrayList<>(prototype.skills);
    }

    // Prototype method: returns a new instance carrying the same data.
    @Override
    public Character clonePrototype() {
        return new Character(this);
    }

    public Character withName(String name) {
        this.name = name;
        return this;
    }

    public Character withWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public Character withSkill(String skill) {
        this.skills.add(skill);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return String.format(
                "%s [%s] health=%d attack=%d defense=%d weapon=%s skills=%s",
                name, type, health, attack, defense, weapon, skills
        );
    }
}
