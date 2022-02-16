package things.Items.types;

import things.Items.Protector;

public enum ProtectorType {

    SHIELD("Sheild", 2),
    METAL_ARMOUR("Metal Armour", 5),
    LEATHER_ARMOUR("Leather Armour", 3),
    CHAINMAIL("Chainmail", 2);

    private static String type;
    private static int defenceMod;

    ProtectorType(String type, int defenceMod) {
    }

    public static String getType() {return type;}

    public static int getDefenceMod() {return defenceMod;}
}