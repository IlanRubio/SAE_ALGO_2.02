package modele;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode efficace de la classe Solution.
     */
    void efficace() {
        Scenario scenar ;
        Joueur j1 = new Joueur();
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_0.txt");
        scenar = LectureFichierQuete.lecture(file);
        Solution solutionEfficace = new Solution(scenar, j1);
        solutionEfficace.efficace();
        Quete quete1 = new Quete("1 - [4, 3] - [0, 0, 0, 0] - 2 - 100 - explorer pic de Bhanborim");
        Quete quete2 = new Quete("2 - [3, 1] - [1, 0, 0, 0] - 1 - 150 - dialoguer avec Kaela la chaman des esprits");
        Quete quete3 = new Quete("4 - [3, 2] - [2, 0, 0, 0] - 6 - 100 - vaincre Loup Géant");
        Quete quete4 = new Quete("0 - [1, 1] - [3, 4, 0, 0] - 4 - 350 - vaincre Araignée lunaire");
        Quete[] elements = {quete1,quete2,quete3,quete4};
        ArrayList <Quete> listattendu = new ArrayList<>(Arrays.asList(elements));

        assertEquals(listattendu,j1.getQueteAcc());


    }

    @org.junit.jupiter.api.Test
    /**
     Méthode de test de la méthode exhaustive de la classe Solution.
     */
    void exhaustive() {
        Scenario scenar ;
        Joueur j1 = new Joueur();
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_0.txt");
        scenar = LectureFichierQuete.lecture(file);
        Solution solutionExhaustive = new Solution(scenar, j1);
        solutionExhaustive.exhaustive();
        Quete quete1 = new Quete("1 - [4, 3] - [0, 0, 0, 0] - 2 - 100 - explorer pic de Bhanborim");
        Quete quete2 = new Quete("2 - [3, 1] - [1, 0, 0, 0] - 1 - 150 - dialoguer avec Kaela la chaman des esprits");
        Quete quete3 = new Quete("4 - [3, 2] - [2, 0, 0, 0] - 6 - 100 - vaincre Loup Géant");
        Quete quete4 = new Quete("3 - [0, 4] - [2, 0, 0, 0] - 3 - 200 - explorer palais de Ahehona");
        Quete quete5 = new Quete("0 - [1, 1] - [3, 4, 0, 0] - 4 - 350 - vaincre Araignée lunaire");
        Quete[] elements = {quete1,quete2,quete3,quete4,quete5};
        ArrayList <Quete> listattendu = new ArrayList<>(Arrays.asList(elements));

        assertEquals(listattendu,j1.getQueteAcc());
    }
}