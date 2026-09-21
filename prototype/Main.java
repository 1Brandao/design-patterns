public class Main {

    public static void main(String[] args) {

        CharacterRegistry registry = new CharacterRegistry();

        // New characters come from the prototypes; only what changes is informed.
        Character arthos = registry.create("Warrior").withName("Arthos");
        Character brakus = registry.create("Warrior").withName("Brakus").withWeapon("Axe");
        Character lyra = registry.create("Mage").withName("Lyra");
        Character finn = registry.create("Archer").withName("Finn");

        System.out.println(arthos);
        System.out.println(brakus);
        System.out.println(lyra);
        System.out.println(finn);

        System.out.println();

        // Additional challenge: a deep copy keeps the clone's skills independent.
        Character veteran = registry.create("Warrior").withName("Veteran").withSkill("Berserk");
        Character rookie = registry.create("Warrior").withName("Rookie");

        System.out.println(veteran);
        System.out.println(rookie);
        System.out.println("Prototype untouched? " + (rookie.getSkills().size() == 2));
    }
}
