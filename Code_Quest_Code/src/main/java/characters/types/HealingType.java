package characters.types;

public enum HealingType {

    CLERIC("Cleric", 10, 2, 1),
    HERBALIST("Herbalist", 10, 1, 5);

    private static String type;
    private static int health;
    private static int attack;
    private static int defence;

    HealingType(String type, int health, int attack, int defence) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}
}