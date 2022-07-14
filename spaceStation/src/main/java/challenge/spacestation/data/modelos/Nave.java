package challenge.spacestation.data.modelos;

/**
 *
 * @author mcami
 */
public class Nave {
    private int id;
    private String name;
    private String country;
    private int activity_start;
    private int activity_end;
    private String fuel;
    
    public Nave(){
        
    };

    public Nave(int id, String name, String country, int activity_start, int activity_end, String fuel) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.activity_start = activity_start;
        this.activity_end = activity_end;
        this.fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getActivity_start() {
        return activity_start;
    }

    public void setActivity_start(int activity_start) {
        this.activity_start = activity_start;
    }

    public int getActivity_end() {
        return activity_end;
    }

    public void setActivity_end(int activity_end) {
        this.activity_end = activity_end;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    } 
}
