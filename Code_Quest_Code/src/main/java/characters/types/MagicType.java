package characters.types;

public enum MagicType {
    WARLOCK("Warlock", 10, 3, 4),
    PROPHETESS("Prophetess", 10, 2, 5),
    SORCERER("Sorcerer", 10, 2, 3),
    SORCERESS("Sorceresss", 10, 1, 4);

    private static String type;
    private static int health;
    private static int attack;
    private static int defence;

    MagicType(String type, int health, int attack, int defence) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}
}
