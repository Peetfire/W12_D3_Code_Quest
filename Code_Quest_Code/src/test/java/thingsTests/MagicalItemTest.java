package thingsTests;

import org.junit.Before;
import org.junit.Test;
import things.Items.MagicItem;
import things.Items.types.MagicItemType;

import static org.junit.Assert.assertEquals;

public class MagicalItemTest {
    MagicItem magicItem;

    @Before
    public void before(){
        magicItem = new MagicItem(MagicItemType.ALL_UP);
    }

    @Test
    public void hasName(){
        assertEquals("Ambrosia", magicItem.getName());
    }

    @Test
    public void hasType(){
        assertEquals(MagicItemType.ALL_UP, magicItem.getMagicItemType());
    }

    @Test
    public void hasHealthMod(){
        assertEquals(5, magicItem.getHealthMod());
    }

    @Test
    public void hasAttackMod(){
        assertEquals(5, magicItem.getAttackMod());
    }

    @Test
    public void hasDefenceMod(){
        assertEquals(5, magicItem.getDefenceMod());
    }

}
