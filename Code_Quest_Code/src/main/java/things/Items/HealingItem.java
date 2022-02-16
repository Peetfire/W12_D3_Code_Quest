package things.Items;


import things.Items.types.HealingItemType;

public class HealingItem {
    private String name;
    private HealingItemType type;
    private int healthMod;

    public HealingItem(HealingItemType type) {
        this.type = type;
        this.name = type.getType();
        this. healthMod = type.getHealthMod();
    }

    public String getName() {
        return name;
    }

    public HealingItemType getType() {
        return type;
    }

    public int getHealthMod() {
        return healthMod;
    }
}
