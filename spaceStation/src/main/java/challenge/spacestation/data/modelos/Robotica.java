package challenge.spacestation.data.modelos;

/**
 *
 * @author mcami
 */
public class Robotica extends Nave{
    public String research;

    public Robotica() {
    }

    public Robotica(String research, int id, String name, String country, int activity_start, int activity_end, String fuel) {
        super(id, name, country, activity_start, activity_end, fuel);
        this.research = research;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}
