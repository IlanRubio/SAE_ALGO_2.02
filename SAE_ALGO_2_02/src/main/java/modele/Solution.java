package modele;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * La classe Solution représente une solution avec son scénario et son joueur associés.
 */
public class Solution {
    private Scenario chScenario;
    private Joueur chJoueur;
    private boolean chQueteFinal = false;

    /**
     * Constructeur de la classe Solution.
     *
     * @param parScenario Le scénario associé à la solution.
     * @param parJoueur   Le joueur associé à la solution.
     */
    public Solution(Scenario parScenario, Joueur parJoueur) {
        this.chScenario = parScenario;
        this.chJoueur = parJoueur;
    }

    /**
     * Effectue une recherche efficace pour trouver une solution optimale en terme de déplacement.
     * Met à jour les valeurs de l'objet Joueur
     *
     */
    public void efficace() {


    }

    /**
     * Calcule la distance entre la quete et la position du joueur.
     *
     * @param pos1 Les coordonnées de la première position [x, y].
     * @param pos2 Les coordonnées de la deuxième position [x, y].
     * @return La distance entre les deux positions.
     */
    private int calculerDistance(int[] pos1, int[] pos2) {
        int dx = pos2[0] - pos1[0];
        int dy = pos2[1] - pos1[1];
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Effectue une recherche exhaustive pour compléter toutes les quetes possibles.
     *
     * @return Une liste d'entiers représentant toutes les quetes à réaliser et dans quel ordre.
     */
    public ArrayList<Integer> exhaustive() {
        return null;
    }

    /**
     * Effectue une recherche optimisée pour trouver la solution la plus rapide.
     *
     * @return Une liste d'entiers représentant toutes les quetes à réaliser et dans quel ordre.
     */
    public ArrayList<Integer> speedrun() {
        return null;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Solution.
     *
     * @return La représentation de la solution.
     */
    public String toString() {
        return null;
    }
}

