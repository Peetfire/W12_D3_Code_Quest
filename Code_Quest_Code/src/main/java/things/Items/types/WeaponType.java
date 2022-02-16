package things.Items.types;

public enum WeaponType {
    SWORD("Sword", 2),
    AXE("Axe", 3),
    CLAYMORE("Claymore", 3),
    LONGBOW("Longbow", 2),
    CROSSBOW("Crossbow", 5);

    private final String type;
    private final int attackMod;

    WeaponType(String type, int attackMod) {
        this.type = type;
        this.attackMod = attackMod;
    }

    public String getType() {return type;}

    public int getAttackMod() {return attackMod;}
}
