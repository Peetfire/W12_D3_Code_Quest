package characters;

public abstract class Character {
    private String name;
    private int health;
    private int attack;
    private int defence;
    private int attackMod;
    private int defenceMod;

    public Character(String name, int health, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.attackMod = 0;
        this.defenceMod = 0;
    }

    public boolean isDead(){
        return health == 0;
    }
}
