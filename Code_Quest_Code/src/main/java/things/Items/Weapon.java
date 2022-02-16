package things.Items;

import things.Items.types.WeaponType;

public class Weapon {
    private String name;
    private WeaponType type;
    private int attackMod;

    public Weapon(WeaponType type) {
        this.name = type.getType();
        this.type = type;
        this.attackMod = type.getAttackMod();
    }

    public String getName() {
        return name;
    }

    public WeaponType getType() {
        return type;
    }

    public int getAttackMod() {
        return attackMod;
    }
}
