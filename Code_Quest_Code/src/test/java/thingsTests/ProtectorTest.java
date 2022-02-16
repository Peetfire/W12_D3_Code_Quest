package thingsTests;

import org.junit.Before;
import org.junit.Test;
import things.Items.Protector;
import things.Items.types.ProtectorType;
import things.Items.types.WeaponType;

import static org.junit.Assert.assertEquals;

public class ProtectorTest {
    Protector protector;

    @Before
    public void before(){
        protector = new Protector(ProtectorType.LEATHER_ARMOUR);
    }

    @Test
    public void hasName(){
        assertEquals("Leather Armour", protector.getName());
    }

    @Test
    public void hasType(){
        assertEquals(ProtectorType.LEATHER_ARMOUR, protector.getType());
    }

    @Test
    public void hasDefenceMod(){
        assertEquals(3, protector.getDefenceMod());
    }
}
