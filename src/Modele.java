/**
 * Created by yassirhessane on 13/08/16.
 */
public class Modele extends ObjetBase {

    protected String description;
    protected String nom;

    public Modele(String nom,String description ) {
        this.description = description;
        this.nom = nom;
    }
    public Modele(String nom) {
        this.nom = nom;
    }

    @Override
    protected String getDescription() {

        if(this.description != null)
        {
            return "Modèle "+this.nom +" : "+ this.description;
        }
        else
        {
            return null;
        }
    }
}
