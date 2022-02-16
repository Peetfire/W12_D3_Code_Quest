package things.Items;

import things.Items.types.HealingItemType;
import things.Items.types.MagicItemType;

public class MagicItem extends HealingItem{
    private MagicItemType magicItemType;
    private int defenceMod;
    private int attackMod;

    public MagicItem(MagicItemType type) {
        super(type.getType(), type.getHealthMod());
        this.magicItemType = type;
        this.attackMod = type.getAttackNod();
        this.defenceMod = type.getDefenceMod();
    }

    public MagicItemType getMagicItemType() {
        return this.magicItemType;
    }

    public int getDefenceMod() {
        return defenceMod;
    }

    public int getAttackMod() {
        return attackMod;
    }
}
