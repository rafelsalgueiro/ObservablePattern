import java.util.Observable;

public class Task extends Observable {
    protected int cost;

    protected Task(int cost) {
        this.cost = cost;
    }

    public final int costInEuros() {
        return this.cost;
    }

}