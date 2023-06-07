package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import static modele.ConstanteScenario.SCENARIOTXT;

/**
 * La classe LectureFichierQuete permet de lire un fichier de quêtes et de retourner un objet Scenario.
 */
public class LectureFichierQuete {
    private static Scenario chScenario = new Scenario();
    private static TreeMap<Integer,ArrayList<Quete>> chListScenario = new TreeMap<>();
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

    /**
     * Lit les fichiers de scénarios à partir de la liste SCENARIOTXT et retourne un TreeMap des scénarios.
     * Chaque scénario est représenté par un numéro d'index et une liste de quêtes correspondantes.
     * @return Un TreeMap contenant les scénarios avec leurs numéros d'index et les listes de quêtes associées.
     */
    public static TreeMap<Integer, ArrayList<Quete>> lectureScenarios(){
        int numScenario = 0;
        for (String scenar : SCENARIOTXT){
            File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+scenar);
            lecture(file);
            ArrayList<Quete> listeQuete=new ArrayList<Quete>();
            for (Quete quete : chScenario.getScenario().values()) {
                listeQuete.add(quete);
            }
            chListScenario.put(numScenario,listeQuete);
            numScenario++;
        }
        return chListScenario;
    }

    /**
     * Renvoie le TreeMap des scénarios actuellement stockés.
     * @return Le TreeMap contenant les scénarios avec leurs numéros d'index et les listes de quêtes associées.
     */
    public static TreeMap<Integer, ArrayList<Quete>> getChListScenario(){
        return chListScenario;
    }

    /**
     * Renvoie la liste de quêtes correspondant au numéro de scénario spécifié.
     * @param parNumScenario Le numéro de scénario pour lequel on souhaite récupérer les quêtes.
     * @return La liste de quêtes correspondant au numéro de scénario spécifié.
     */
    public ArrayList<Quete> getQueteDuScenar(int parNumScenario) {
        return chListScenario.get(parNumScenario);
    }

    /**
     * Renvoie le scénario correspondant au numéro de scénario spécifié.
     * @param parNumScenario Le numéro de scénario pour lequel on souhaite récupérer le scénario.
     * @return Le scénario correspondant au numéro de scénario spécifié.
     */
    public Scenario getScenario(int parNumScenario){
        chScenario = new Scenario();
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+SCENARIOTXT[parNumScenario]);
        return lecture(file);
    }
}
