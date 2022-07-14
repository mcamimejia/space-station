package challenge.spacestation.data.modelos;

/**
 *
 * @author mcami
 */
public class Lanzadera extends Nave{
    public String cargo;

    public Lanzadera() {
    }

    public Lanzadera(String cargo, int id, String name, String country, int activity_start, int activity_end, String fuel) {
        super(id, name, country, activity_start, activity_end, fuel);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
