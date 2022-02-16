package characters.types;

import things.Items.Protector;
import things.Items.Weapon;

public enum PlayerType {
    DWARF("Dwarf", 10, 6, 8, ),
    KNIGHT("Knight", 10, 8, 6),
    AMAZON("Amazon", 10, 9, 4),
    VALKYRIE("Valkyerie", 10, 8, 7);

    private static String type;
    private static int health;
    private static int attack;
    private static int defence;
    private static WeaponType weapon;
    private static Protector protector;

    PlayerType(String type, int health, int attack, int defence, Weapon weapon, Protector protector) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}
}
