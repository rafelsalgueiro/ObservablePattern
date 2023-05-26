import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SimpleTest {

    @Test
    public void createSimpleTask() {
        Simple simpleTask = new Simple(5);
        assertEquals(5, simpleTask.costInEuros());
    }

    @Test
    public void createAndEditSimpleTask() {
        Simple simpleTask = new Simple(5);
        simpleTask.changeCost(10);
        assertEquals(10, simpleTask.costInEuros());
    }

    @Test
    public void createSimpleTaskNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Simple(-1));
    }
}