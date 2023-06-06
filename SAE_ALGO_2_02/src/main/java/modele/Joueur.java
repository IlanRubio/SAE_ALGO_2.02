package modele;

import java.util.ArrayList;

/**
 * La classe Joueur représente un joueur avec ses attributs.
 */
public class Joueur {
    private int chExpJ;
    private int[] chPositionJ;
    private int chDureeJ;
    private ArrayList<Quete> chListeQueteAcc;

    /**
     * Constructeur de la classe Joueur.
     */
    public Joueur() {
        chExpJ = 0;
        chDureeJ = 0;
        chListeQueteAcc = new ArrayList<Quete>();
        chPositionJ = new int[2];
    }

    /**
     * Ajoute de l'expérience au joueur.
     *
     * @param parExp La quantité d'expérience à ajouter.
     */
    public void ajoutExp(int parExp) {
        chExpJ += parExp;
    }

    /**
     * Ajoute de la durée au joueur.
     *
     * @param parDuree La durée à ajouter.
     */
    public void ajoutDuree(int parDuree) {
        chDureeJ += parDuree;
    }

    /**
     * Met à jour la position du joueur.
     *
     * @param parPosition Le tableau contenant la nouvelle position du joueur.
     */
    public void majPosition(int[] parPosition) {
        chPositionJ = parPosition;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Joueur.
     *
     * @return La représentation du joueur.
     */
    public String toString() {
        return "Expérience du joueur: " + chExpJ +
                ", Position du joueur: (" + chPositionJ[0] + ", " + chPositionJ[1] + ")" +
                ", Temps prit par le joueur : " + chDureeJ +
                ", Quêtes accomplies par le joueur : " + chListeQueteAcc.toString();
    }

    /**
     * Ajoute une quête à la liste des quêtes accomplies par le joueur.
     *
     * @param parQuete La quête à ajouter.
     */
    public void ajoutQuete(Quete parQuete) {
        chListeQueteAcc.add(parQuete);
    }

    /**
     * Retourne la position du joueur.
     *
     * @return Le tableau contenant la position du joueur.
     */
    public int[] getPosJ() {
        return chPositionJ;
    }

    /**
     * Retourne l'expérience du joueur.
     *
     * @return L'expérience du joueur.
     */
    public int getExpJ() {
        return chExpJ;
    }

    /**
     * Retourne la durée du joueur.
     *
     * @return La durée du joueur.
     */
    public int getDureeJ() {
        return chDureeJ;
    }

    /**
     * Retourne la liste des quêtes accomplies par le joueur.
     *
     * @return La liste des quêtes accomplies par le joueur.
     */
    public ArrayList<Quete> getQueteAcc() {
        return chListeQueteAcc;
    }
    /**
     * Vérifie si une quête spécifique a été complétée.
     *
     * @param parQuete La quête à vérifier.
     * @return true si la quête est dans la liste des quêtes complétées, false sinon.
     */
    public boolean queteCompletee(Quete parQuete){
        return chListeQueteAcc.contains(parQuete);
    }
}
