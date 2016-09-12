import com.sun.tools.internal.ws.processor.model.Model;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Vehicule vehicule = new Vehicule("Auto++ KT500 d\'occasion en bon état");
        System.out.println(vehicule.getDescription());

        Modele modele = new Modele("KT400","Le véhicule spacieux et confortable");

        Vehicule vehicule1 = new Vehicule();
        vehicule1.setSuivant(modele);

        System.out.println(vehicule1.donneDescription());

        Marque marque = new Marque("Auto++","La marque des autos","de grande qualité");

        Modele modele1 = new Modele("KT700");
        modele1.setSuivant(marque);

        Vehicule vehicule2 = new Vehicule();

        vehicule2.setSuivant(modele1);

        System.out.println(vehicule2.donneDescription());

        Vehicule vehicule3 = new Vehicule();
        System.out.println(vehicule3.donneDescription());

        System.out.println();
    }
}
