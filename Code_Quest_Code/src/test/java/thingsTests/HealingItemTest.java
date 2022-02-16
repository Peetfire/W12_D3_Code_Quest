package thingsTests;

import org.junit.Before;
import org.junit.Test;
import things.Items.HealingItem;
import things.Items.types.HealingItemType;

import static org.junit.Assert.assertEquals;

public class HealingItemTest {
    HealingItem healingItem;

    @Before
    public void before(){
        healingItem = new HealingItem(HealingItemType.ALIEN_ARTIFACT);
    }

    @Test
    public void hasName(){
        assertEquals("Alien Artifact", healingItem.getName());
    }

    @Test
    public void hasType(){
        assertEquals(HealingItemType.ALIEN_ARTIFACT, healingItem.getHealingItemType());
    }

    @Test
    public void hasHealthMod(){
        assertEquals(10, healingItem.getHealthMod());
    }
}
