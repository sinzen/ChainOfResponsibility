/**
 * Created by yassirhessane on 13/08/16.
 */
public class Vehicule extends ObjetBase {

    protected String description;

    public Vehicule(String description) {
        this.description = description;
    }

    public Vehicule()
    {

    }

    @Override
    protected String getDescription() {
        return this.description;
    }
}
