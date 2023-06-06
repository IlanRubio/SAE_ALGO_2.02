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
        while (!chQueteFinal) {
            HashMap<Integer, Integer> quetePossible = new HashMap<Integer, Integer>();
            // Parcours les quêtes du scénario dans l'ordre croissant de leurs numéros
            for (Quete quete : chScenario.getScenario().values()) {
                if (!chJoueur.getQueteAcc().contains(quete)) {
                    if (preconditionRealise(chJoueur, quete)) {
                        if (quete.getNumero() == 0 && chJoueur.getExpJ() >= quete.getExp()) {
                            chQueteFinal = true;
                            chJoueur.ajoutQuete(quete);
                            chJoueur.ajoutDuree(quete.getDuree() + calculerDistance(chJoueur.getPosJ(), quete.getPos()));
                            break;
                        } else if (quete.getNumero() != 0) {
                            quetePossible.put(quete.getNumero(), calculerDistance(chJoueur.getPosJ(), quete.getPos()));
                        }
                    }
                }
            }

            Integer queteMin = 0;
            int distanceMin = Integer.MAX_VALUE;
            ;

            // Boucle for pour parcourir les clés du dictionnaire
            for (Integer quete : quetePossible.keySet()) {
                int distance = quetePossible.get(quete);

                // Vérifier si la valeur actuelle est inférieure à la valeur minimale
                if (distance < distanceMin) {
                    distanceMin = distance;
                    queteMin = quete;
                }
            }
            if (queteMin != 0) {
                chJoueur.ajoutQuete(chScenario.getQuete(queteMin));
                chJoueur.ajoutDuree(chScenario.getQuete(queteMin).getDuree() + distanceMin);
                chJoueur.ajoutExp(chScenario.getQuete(queteMin).getExp());
                chJoueur.majPosition(chScenario.getQuete(queteMin).getPos());
            }
        }

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
        return Math.abs(dx)+ Math.abs(dy);
    }

    /**
     * Vérifie si les préconditions d'une quête sont satisfaites pour un joueur donné.
     *
     * @param parJoueur Le joueur pour lequel vérifier les préconditions.
     * @param parQuete La quête dont on vérifie les préconditions.
     * @return true si toutes les préconditions de la quête sont satisfaites, false sinon.
     */
    private boolean preconditionRealise(Joueur parJoueur, Quete parQuete){
        int[] preconditions = parQuete.getPrecond();

        // Vérifier les deux premières préconditions
        if (preconditions[1] == 0 && preconditions[0] != 0) {
            // Si le deuxième indice est zéro et le premier n'est pas zéro,
            // alors la quête a une précondition à vérifier
            Quete quetePrecondition = chScenario.getQuete(preconditions[0]);;
            if (!parJoueur.queteCompletee(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[1] != 0) {
            // Si le deuxième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            Quete quetePrecondition1 = chScenario.getQuete(preconditions[0]);;
            Quete quetePrecondition2 = chScenario.getQuete(preconditions[1]);;
            if (!parJoueur.queteCompletee(quetePrecondition1) && !parJoueur.queteCompletee(quetePrecondition2)) {
                return false;
            }
        }

        // Vérifier les deux dernières préconditions
        if (preconditions[3] == 0 && preconditions[2] != 0) {
            // Si le quatrième indice est zéro et le troisième n'est pas zéro,
            // alors la quête a une précondition à vérifier
            Quete quetePrecondition = chScenario.getQuete(preconditions[2]);
            if (!parJoueur.queteCompletee(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[3] != 0) {
            // Si le quatrième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            Quete quetePrecondition1 = chScenario.getQuete(preconditions[2]);
            Quete quetePrecondition2 = chScenario.getQuete(preconditions[3]);
            if (!parJoueur.queteCompletee(quetePrecondition1) && !parJoueur.queteCompletee(quetePrecondition2)) {
                return false;
            }
        }

        // Toutes les préconditions sont satisfaites
        return true;

    }

    /**
     * Effectue une recherche exhaustive pour compléter toutes les quetes possibles.
     *
     */
    public void exhaustive() {
        while(!chQueteFinal){
            HashMap<Integer, Integer> quetePossible = new HashMap<Integer, Integer>();
            // Parcours les quêtes du scénario dans l'ordre croissant de leurs numéros
            for (Quete quete : chScenario.getScenario().values()) {
                if (!chJoueur.getQueteAcc().contains(quete)) {
                    if (preconditionRealise(chJoueur, quete)) {
                        if (quete.getNumero() == 0 && chScenario.getNombreQuetes() - chJoueur.getQueteAcc().size()==1) {
                            chQueteFinal = true;
                            chJoueur.ajoutQuete(quete);
                            chJoueur.ajoutDuree(quete.getDuree() + calculerDistance(chJoueur.getPosJ(), quete.getPos()));
                            break;
                        } else if (quete.getNumero() != 0) {
                            quetePossible.put(quete.getNumero(), calculerDistance(chJoueur.getPosJ(), quete.getPos()));
                        }
                    }
                }
            }

            Integer queteMin = 0;
            int distanceMin = Integer.MAX_VALUE;
            ;

            // Boucle for pour parcourir les clés du dictionnaire
            for (Integer quete : quetePossible.keySet()) {
                int distance = quetePossible.get(quete);

                // Vérifier si la valeur actuelle est inférieure à la valeur minimale
                if (distance < distanceMin) {
                    distanceMin = distance;
                    queteMin = quete;
                }
            }
            if (queteMin != 0) {
                chJoueur.ajoutQuete(chScenario.getQuete(queteMin));
                chJoueur.ajoutDuree(chScenario.getQuete(queteMin).getDuree() + distanceMin);
                chJoueur.ajoutExp(chScenario.getQuete(queteMin).getExp());
                chJoueur.majPosition(chScenario.getQuete(queteMin).getPos());
            }
        }
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

