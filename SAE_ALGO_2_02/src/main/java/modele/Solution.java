package modele;

import java.util.ArrayList;

/**
 * La classe Solution représente une solution avec son scénario et son joueur associés.
 */
public class Solution {
    private Scenario chScenario;
    private Joueur chJoueur;

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
     *
     * @return Une liste d'entiers représentant toutes les quetes à réaliser et dans quel ordre.
     */
    public ArrayList<Integer> efficace() {
        return null;
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

