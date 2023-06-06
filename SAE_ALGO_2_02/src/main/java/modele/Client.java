package modele;

import java.io.File;

/**
 * La classe Client est la classe principale du programme.
 */
public class Client {
    static Scenario sc;
    static Joueur j1 = new Joueur();
    static Joueur j2 = new Joueur();
    public static void main(String[] args) {
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_4.txt");
        sc = LectureFichierQuete.lecture(file);
        Solution solutionEfficace = new Solution(sc, j1);
        solutionEfficace.efficace();
        System.out.println("Solution efficace : ");
        System.out.println("Total xp : " + j1.getExpJ());
        System.out.println("Total durée : " + j1.getDureeJ());
        System.out.println("Nombre de quetes realisees : " + j1.getQueteAcc().size());
        for (Quete quete : j1.getQueteAcc()){
            System.out.println(quete);
        }
        Solution solutionExhaustive = new Solution(sc, j2);
        solutionExhaustive.exhaustive();
        System.out.println("Solution exhaustive : ");
        System.out.println("Total xp : " + j2.getExpJ());
        System.out.println("Total durée : " + j2.getDureeJ());
        System.out.println("Nombre de quetes realisees : " + j2.getQueteAcc().size());
        for (Quete quete : j2.getQueteAcc()){
            System.out.println(quete);
        }
    }
}


