package modele;

import java.io.File;

/**
 * La classe Client est la classe principale du programme.
 */
public class Client {
    static Scenario sc;
    static Joueur j1 = new Joueur();
    public static void main(String[] args) {
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_0.txt");
        sc = LectureFichierQuete.lecture(file);
        Solution solutionEfficace = new Solution(sc, j1);
        solutionEfficace.efficace();
        System.out.println(j1.getQueteAcc());
    }
}


