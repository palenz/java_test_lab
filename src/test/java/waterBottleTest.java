import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterBottleTest {

    waterBottle waterBottle;
    @Before
    public void before(){
        waterBottle = new waterBottle();
    }

    @Test
    public void startsAt100(){
        assertEquals(100, this.waterBottle.content);
    }

    @Test
    public void drink(){
        assertEquals(90, this.waterBottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, this.waterBottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100, this.waterBottle.fill());
    }
}
