package things.Items;

import things.Items.types.ProtectorType;

public class Protector {
    private String name;
    private ProtectorType type;
    private int defenceMod;

    public Protector(ProtectorType type) {
        this.name = type.getType();
        this.type = type;
        this.defenceMod = type.getDefenceMod();
    }

    public String getName() {
        return name;
    }

    public ProtectorType getType() {
        return type;
    }

    public int getDefenceMod() {
        return defenceMod;
    }
}
