package things.Items.types;

import things.Items.Protector;

public enum ProtectorType {

    SHIELD("Sheild", 2),
    METAL_ARMOUR("Metal Armour", 5),
    LEATHER_ARMOUR("Leather Armour", 3),
    CHAINMAIL("Chainmail", 2);

    private final String type;
    private final int defenceMod;

    ProtectorType(String type, int defenceMod) {
        this.type = type;
        this.defenceMod = defenceMod;
    }

    public String getType() {return type;}

    public int getDefenceMod() {return defenceMod;}
}