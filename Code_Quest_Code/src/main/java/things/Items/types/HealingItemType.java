package things.Items.types;

public enum HealingItemType {
    HERBS("Herbs", 3),
    BANDAGES("Bandages", 5),
    POULTICE("Poultice", 2),
    ALIEN_ARTIFACT("Alien Artifact", 10);

    private final String type;
    private final int healthMod;

    HealingItemType(String type, int healthMod) {
        this.type = type;
        this.healthMod = healthMod;
    }

    public String getType() {
        return type;
    }

    public int getHealthMod() {
        return healthMod;
    }
}
