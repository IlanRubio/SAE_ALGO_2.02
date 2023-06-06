package modele;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * La classe ScenarioTest permet de tester la classe Scenario
 */
class ScenarioTest {

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode ajoutQuete de la classe Scenario.
     */
    void ajoutQuete() {
        Scenario scenarioAttendu = new Scenario();
        TreeMap<Integer, Quete> tm = new TreeMap<Integer, Quete>();
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        tm.put(1,objet);
        scenarioAttendu.ajoutQuete(objet);
        assertEquals(scenarioAttendu.getScenario(),tm);
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getQuete de la classe Scenario.
     */
    void getQuete() {
        Scenario scenarioAttendu = new Scenario();
        Quete objet = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        scenarioAttendu.ajoutQuete(objet);
        assertEquals(scenarioAttendu.getQuete(1),objet);
    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode getNombreQuetes de la classe Scenario.
     */
    void getNombreQuetes() {
        Scenario scenarioAttendu = new Scenario();
        assertEquals(0,scenarioAttendu.getNombreQuetes());

        Quete quete1 = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        scenarioAttendu.ajoutQuete(quete1);
        assertEquals(1,scenarioAttendu.getNombreQuetes());

        Quete quete2 = new Quete("2|(3, 1)|((1,),)|1|150|dialoguer avec Kaela la chaman des esprits");
        scenarioAttendu.ajoutQuete(quete2);
        assertEquals(2,scenarioAttendu.getNombreQuetes());
    }
}