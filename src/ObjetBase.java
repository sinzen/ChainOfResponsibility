/**
 * Created by yassirhessane on 13/08/16.
 */
abstract class ObjetBase {

    protected ObjetBase suivant;

    private String descriptionParDefaut()
    {
        return "description par défaut";
    }

    protected abstract String getDescription();

    public String donneDescription()
    {
        String resultat = this.getDescription();
        if(resultat != null)
        {
            return resultat;
        }
        if (this.suivant != null)
        {
            return this.suivant.donneDescription();
        }
        else
        {
            return this.descriptionParDefaut();
        }
    }

    public void setSuivant(ObjetBase suivant)
    {
        this.suivant = suivant;
    }
}
