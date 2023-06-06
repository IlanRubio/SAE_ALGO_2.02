package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * La classe LectureFichierQuete permet de lire un fichier de quêtes et de retourner un objet Scenario.
 */
public class LectureFichierQuete {
    private static Scenario chScenario = new Scenario();
    /**
     * Lit un fichier de quêtes et retourne un objet Scenario correspondant.
     *
     * @param parFile Le fichier de quêtes à lire.
     * @return Un objet Scenario contenant les quêtes lues.
     */
    public static Scenario lecture(File parFile) {
        try{
            Scanner sc = new Scanner(parFile);
            while (sc.hasNext()){
                Quete q = new Quete(sc.nextLine());
                chScenario.ajoutQuete(q);
            }
        }
        catch (FileNotFoundException e ){
            System.err.println(e.getMessage());
        }
        return chScenario;
    }
}

