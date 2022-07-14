package challenge.spacestation.data.modelos;

/**
 *
 * @author mcami
 */
public class Tripulada extends Nave{
    public int capacity;
    public String objective;

    public Tripulada() {
    }

    public Tripulada(int capacity, String objective, int id, String name, String country, int activity_start, int activity_end, String fuel) {
        super(id, name, country, activity_start, activity_end, fuel);
        this.capacity = capacity;
        this.objective = objective;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
