package thingsTests;

import org.junit.Before;
import org.junit.Test;
import things.Items.Weapon;
import things.Items.types.WeaponType;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.AXE);
    }
    
    @Test
    public void hasName(){
        assertEquals("Axe", weapon.getName());
    }

    @Test
    public void hasType(){
        assertEquals(WeaponType.AXE, weapon.getType());
    }

    @Test
    public void hasAttackMod(){
        assertEquals(3, weapon.getAttackMod());
    }
}

