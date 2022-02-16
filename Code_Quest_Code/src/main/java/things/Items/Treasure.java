package things.Items;

import things.Items.types.TreasureType;

public class Treasure {
    private String name;
    private TreasureType tyoe;
    private int value;

    public Treasure(TreasureType type) {
        this.tyoe = type;
        this.name = type.getName();
        this.value = type.getValue();
    }

    public String getName() {
        return name;
    }

    public TreasureType getType() {
        return tyoe;
    }

    public int getValue() {
        return value;
    }
}
