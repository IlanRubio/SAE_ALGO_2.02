package modele;

import java.util.TreeMap;


/**
 * La classe Scenario représente un scénario avec ses attributs associés.
 */
public class Scenario {
    private TreeMap<Integer, Quete> chTreeMapQuete;

    /**
     * Constructeur de la classe Scenario.
     */
    public Scenario(){
        chTreeMapQuete = new TreeMap<Integer, Quete>();
    }

    /**
     * Ajoute une quête au scénario.
     *
     * @param parQuete La quête à ajouter.
     */
    public void ajoutQuete(Quete parQuete) {
        chTreeMapQuete.put(parQuete.getNumero(), parQuete);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Scenario.
     *
     * @return La représentation du scénario.
     */
    public String toString() {
        String affiche = "";
        for (Quete quete : chTreeMapQuete.values()) {
            affiche += quete.toString() + "\n";
        }
        return affiche;
    }

    /**
     * Retourne la quête correspondant au numéro de quête spécifié.
     *
     * @param parNumQuete Le numéro de la quête.
     * @return La quête correspondante.
     */
    public Quete getQuete(int parNumQuete) {
        return chTreeMapQuete.get(parNumQuete);
    }
}

