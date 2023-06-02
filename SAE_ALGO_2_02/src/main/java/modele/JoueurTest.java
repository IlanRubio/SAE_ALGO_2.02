package modele;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe JoueurTest permet de tester la classe Joueur
 */
class JoueurTest {

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode ajoutExp de la classe Joueur.
     */
    void ajoutExp() {
        int attendu = 5;
        Joueur j = new Joueur();
        j.ajoutExp(5);
        assertEquals(attendu,j.getExpJ());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode ajoutDuree de la classe Joueur.
     */
    void ajoutDuree() {
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode majPosition de la classe Joueur.
     */
    void majPosition() {
    }


    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode ajoutQuete de la classe Joueur.
     */
    void ajoutQuete() {
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getPosJ de la classe Joueur.
     */
    void getPosJ() {
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getExpJ de la classe Joueur.
     */
    void getExpJ() {
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getDureeJ de la classe Joueur.
     */
    void getDureeJ() {
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getQueteAcc de la classe Joueur.
     */
    void getQueteAcc() {
    }
}