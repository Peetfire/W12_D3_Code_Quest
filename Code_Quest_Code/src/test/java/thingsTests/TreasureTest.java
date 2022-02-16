package thingsTests;

import org.junit.Before;
import org.junit.Test;
import things.Items.Treasure;
import things.Items.types.TreasureType;

import static org.junit.Assert.assertEquals;

public class TreasureTest {
    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure(TreasureType.GOLD);
    }

    @Test
    public void hasName(){
        assertEquals("Gold", treasure.getName());
    }

    @Test
    public void hasType(){
        assertEquals(TreasureType.GOLD, treasure.getType());
    }

    @Test
    public void hasValue(){
        assertEquals(4, treasure.getValue());
    }
}
