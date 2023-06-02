package modele;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * La classe QueteTest permet de tester la classe Quete
 */
class QueteTest {

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode extraitPrecond de la classe Quete.
     */
    void extraitPrecond() {
        int [] attendu = new int [4];
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu, objet.extraitPrecond("()"));

        int [] attendu2 = new int [4];
        attendu2[0] = 10;
        attendu2[2] = 2;
        attendu2[3] = 8;
        Quete objet2 = new Quete("1|(3, 1)|((10,), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu2, objet2.extraitPrecond("((10,), (2, 8))"));

        int [] attendu3 = new int [4];
        attendu3[0] = 3;
        attendu3[1] = 2;
        Quete objet3 = new Quete("1|(3, 1)|((3, 2),)|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu3, objet3.extraitPrecond("((3, 2),)"));

        int [] attendu4 = new int [4];
        attendu4[0] = 10;
        attendu4[1] = 5;
        attendu4[2] = 2;
        attendu4[3] = 8;
        Quete objet4 = new Quete("1|(3, 1)|((10,5), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu4, objet4.extraitPrecond("((10,5), (2, 8))"));
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode extraitPos de la classe Quete.
     */
    void extraitPos() {
        int [] attendu = new int [2];
        attendu[0] = 3;
        attendu[1] = 1;
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu, objet.extraitPos("(3, 1)"));
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getNumero de la classe Quete.
     */
    void getNumero() {
        int attendu = 1;
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertEquals(attendu, objet.getNumero());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getPrecond de la classe Quete.
     */
    void getPrecond() {
        int [] attendu = new int [4];
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu, objet.getPrecond());

        int [] attendu2 = new int [4];
        attendu2[0] = 10;
        attendu2[2] = 2;
        attendu2[3] = 8;
        Quete objet2 = new Quete("1|(3, 1)|((10,), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu2, objet2.getPrecond());

        int [] attendu3 = new int [4];
        attendu3[0] = 3;
        attendu3[1] = 2;
        Quete objet3 = new Quete("1|(3, 1)|((3, 2),)|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu3, objet3.getPrecond());

        int [] attendu4 = new int [4];
        attendu4[0] = 10;
        attendu4[1] = 5;
        attendu4[2] = 2;
        attendu4[3] = 8;
        Quete objet4 = new Quete("1|(3, 1)|((10,5), (2, 8))|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu4, objet4.getPrecond());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getPos de la classe Quete.
     */
    void getPos() {
        int [] attendu = new int [2];
        attendu[0] = 3;
        attendu[1] = 1;
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertArrayEquals(attendu, objet.getPos());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getDuree de la classe Quete.
     */
    void getDuree() {
        int attendu = 2;
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertEquals(attendu, objet.getDuree());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getExp de la classe Quete.
     */
    void getExp() {
        int attendu = 50;
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertEquals(attendu, objet.getExp());
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getIntitule de la classe Quete.
     */
    void getIntitule() {
        String attendu = "dialoguer avec Alaric le mage noir";
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        assertEquals(attendu, objet.getIntitule());
    }
}