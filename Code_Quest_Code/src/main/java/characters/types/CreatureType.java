package characters.types;

public enum CreatureType {

    OGRE("Ogre", 10, 6, 3),
    TROLL("Troll", 10, 7, 4),
    DRAGON("Dragon", 10, 9, 4),
    PACK_OF_SQUIRRELS("Pack of Squirrels", 10, 5, 8);

    private static String type;
    private static int health;
    private static int attack;
    private static int defence;

    CreatureType(String type, int health, int attack, int defence) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}
}