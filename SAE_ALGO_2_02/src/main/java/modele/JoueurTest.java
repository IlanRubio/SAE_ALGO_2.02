package modele;

import java.util.ArrayList;

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
        int attendu = 7;
        Joueur j = new Joueur();
        j.ajoutDuree(7);
        assertEquals(attendu,j.getDureeJ());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode majPosition de la classe Joueur.
     */
    void majPosition() {
        int [] attendu = new int[2];
        attendu[0] = 3;
        attendu[1] = 1;
        Joueur j = new Joueur();
        j.majPosition(attendu);
        assertArrayEquals(attendu, j.getPosJ());
    }


    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode ajoutQuete de la classe Joueur.
     */
    void ajoutQuete() {
        Quete quete = new Quete("1|(3, 1)|((10,5), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        Joueur j = new Joueur();
        ArrayList<Quete> listeQAttendu = new ArrayList<Quete>();
        listeQAttendu.add(quete);
        j.ajoutQuete(quete);
        assertEquals(listeQAttendu,j.getQueteAcc());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getPosJ de la classe Joueur.
     */
    void getPosJ() {
        int [] attendu = new int [2];
        Joueur j = new Joueur();
        assertArrayEquals(attendu, j.getPosJ());

        int [] attendu1 = new int [2];
        attendu1[0] = 3;
        attendu1[1] = 1;
        Joueur j1 = new Joueur();
        j1.majPosition(attendu1);
        assertArrayEquals(attendu1, j1.getPosJ());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getExpJ de la classe Joueur.
     */
    void getExpJ() {
        int attendu = 5;
        Joueur j = new Joueur();
        j.ajoutExp(5);
        assertEquals(attendu,j.getExpJ());

        int attendu1 = 0;
        Joueur j1 = new Joueur();
        assertEquals(attendu1, j1.getExpJ());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getDureeJ de la classe Joueur.
     */
    void getDureeJ() {
        int attendu = 7;
        Joueur j = new Joueur();
        j.ajoutDuree(7);
        assertEquals(attendu,j.getDureeJ());

        int attendu1 = 0;
        Joueur j1 = new Joueur();
        assertEquals(attendu1, j1.getDureeJ());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getQueteAcc de la classe Joueur.
     */
    void getQueteAcc() {
        Quete quete = new Quete("1|(3, 1)|((10,5), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        Joueur j = new Joueur();
        ArrayList<Quete> listeQAttendu = new ArrayList<Quete>();
        listeQAttendu.add(quete);
        j.ajoutQuete(quete);
        assertEquals(listeQAttendu,j.getQueteAcc());


        Joueur j1 = new Joueur();
        ArrayList<Quete> listeQAttendu1 = new ArrayList<Quete>();
        listeQAttendu.add(quete);
        assertEquals(listeQAttendu1,j1.getQueteAcc());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode queteCompletee de la classe Joueur.
     */
    void queteCompletee() {

        Quete quete1 = new Quete("1|(4, 3)|()|2|100|explorer pic de Bhanborim");
        Joueur j = new Joueur();
        j.ajoutQuete(quete1);
        Quete quete2 = new Quete("2|(3, 1)|((1,),)|1|150|dialoguer avec Kaela la chaman des esprits");
        assertEquals(false,j.queteCompletee(quete2));

        j.ajoutQuete(quete2);
        assertEquals(true,j.queteCompletee(quete2));
    }
}