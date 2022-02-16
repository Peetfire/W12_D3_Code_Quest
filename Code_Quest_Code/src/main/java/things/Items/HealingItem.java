package things.Items;


import things.Items.types.HealingItemType;

public class HealingItem extends Item{
    private HealingItemType healingItemType;
    private int healthMod;

    public HealingItem(String name, int healthMod){
        super(name);
        this.healingItemType = null;
        this.healthMod = healthMod;
    }

    public HealingItem(HealingItemType type) {
        super(type.getType());
        this.healingItemType = type;
        this. healthMod = type.getHealthMod();
    }

    public HealingItemType getHealingItemType() {
        return healingItemType;
    }

    public int getHealthMod() {
        return healthMod;
    }
}
