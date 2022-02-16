package things.Items.types;

public enum MagicItemType {
    HEALTH_UP("Water of life", 5, 0, 0),
    HEALTH_DOWN("Spell of Necrosis", -5, 0, 0),
    STRENGTH_UP("Elixir of Hercules", 0, 4, 0),
    STRENGTH_DOWN("Spell of Enfeeblement", 0, -5, 0),
    DEFENCE_UP("Essence of Pangolin", 0, 5, 0),
    DEFENCE_DOWN("Spell of Lethargy", 0, -5, 0),
    ALL_UP("Ambrosia", 5, 5, 5),
    ALL_DOWN("Spell of much woe", -5, -5, -5);

    private final String type;
    private final int healthMod;
    private final int attackNod;
    private final int defenceMod;

    MagicItemType(String type, int healthMod, int attackNod, int defenceMod) {
        this.type = type;
        this.healthMod = healthMod;
        this.attackNod = attackNod;
        this.defenceMod = defenceMod;
    }

    public String getType() {
        return type;
    }

    public int getHealthMod() {
        return healthMod;
    }

    public int getAttackNod() {
        return attackNod;
    }

    public int getDefenceMod() {
        return defenceMod;
    }
}
