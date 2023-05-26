
public class Simple extends Task {

    protected Simple(int cost) {
        super(cost);
        if (cost < 0) {
            throw new IllegalArgumentException("No negative costs");
        }
       
    }

    public void changeCost(int newCost) {
        if (newCost < 0) {
            throw new IllegalArgumentException("No negative costs");
        }
        setChanged();
        notifyObservers(new Composite.CostChanged(cost, newCost));
        cost = newCost;
    }

}
