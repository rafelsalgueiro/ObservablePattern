import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CompositeTest {

    @Test
    public void appendTask(){
        Simple task1 = new Simple(5);
        Composite compositeTask = new Composite();
        compositeTask.addSubtask(new Task(20));
        compositeTask.addSubtask(new Task(40));
        compositeTask.addSubtask( (Task) task1);
        assertEquals(5, task1.costInEuros());
        task1.changeCost(20);
        Task test = (Task) compositeTask.subtasks.get(2);
        assertEquals(20, test.costInEuros());
        assertEquals(80, compositeTask.costInEuros());
    }
    
}
