import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Composite extends Task implements Observer {
    final ArrayList<Task> subtasks;

    public Composite() {
        super(0);
        subtasks = new ArrayList<>();
    }

    public void addSubtask(Task newTask) {
        newTask.addObserver(this);
        cost += newTask.costInEuros();
        subtasks.add(newTask);

    }

    @Override
    public void update(Observable o, Object arg) {
        CostChanged costs = (CostChanged) arg;
        int incrementCost = costs.newCost - costs.oldCost;
        cost += incrementCost;
        setChanged();
        notifyObservers(new Composite.CostChanged(costs.oldCost, costs.newCost));
    }

    public record CostChanged(int oldCost, int newCost) {}
}
