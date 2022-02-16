package characters;

import characters.types.PlayerType;
import things.Items.Protector;
import things.Items.Treasure;
import things.Items.Weapon;

import java.util.ArrayList;

public class Player extends Character{
    private PlayerType charType;
    private ArrayList<Treasure> wealth;
    private ArrayList<Weapon> weapons;
    private ArrayList<Protector> protectors;
    private Weapon weapon;
    private Protector protector;

    public Player(String name, PlayerType charType) {
        super(name, charType.getHealth(), charType.getAttack(), charType.getDefence());
        this.charType = charType;
    }
}
}
