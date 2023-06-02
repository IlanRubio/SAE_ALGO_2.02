package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * La classe LectureFichierQuete permet de lire un fichier de quêtes et de retourner un objet Scenario.
 */
public class LectureFichierQuete {
    /**
     * Lit un fichier de quêtes et retourne un objet Scenario correspondant.
     *
     * @param parFile Le fichier de quêtes à lire.
     * @return Un objet Scenario contenant les quêtes lues.
     */
    public static Scenario lecture(File parFile) {
        Scenario scenario = new Scenario();
        try{
            Scanner sc = new Scanner(parFile);
            while (sc.hasNext()){
                Quete q = new Quete(sc.nextLine());
                scenario.ajoutQuete(q);
            }
        }
        catch (FileNotFoundException e ){
            System.err.println(e.getMessage());
        }
        return scenario;
    }
}

