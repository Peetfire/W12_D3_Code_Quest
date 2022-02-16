package characters.types;

import things.Items.Protector;
import things.Items.Weapon;
import things.Items.types.ProtectorType;
import things.Items.types.WeaponType;

public enum PlayerType {
    DWARF("Dwarf", 10, 6, 8, WeaponType.AXE, ProtectorType.SHIELD),
    KNIGHT("Knight", 10, 8, 6, WeaponType.CLAYMORE, ProtectorType.METAL_ARMOUR),
    AMAZON("Amazon", 10, 9, 4, WeaponType.LONGBOW, ProtectorType.LEATHER_ARMOUR),
    VALKYRIE("Valkyerie", 10, 8, 7, WeaponType.SWORD, ProtectorType.CHAINMAIL);

    private static String type;
    private static int health;
    private static int attack;
    private static int defence;
    private static WeaponType weapon;
    private static ProtectorType protector;

    PlayerType(String type, int health, int attack, int defence, WeaponType weapon, ProtectorType protector) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}

    public static WeaponType getWeapon() {return weapon;}

    public static ProtectorType getProtector() {return protector;}
}
