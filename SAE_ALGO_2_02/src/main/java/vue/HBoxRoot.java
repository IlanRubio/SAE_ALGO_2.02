package vue;

import controleur.Controleur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import modele.Joueur;
import modele.LectureFichierQuete;
import modele.Scenario;
import modele.Solution;

import java.io.File;

import static modele.LectureFichierQuete.getChListScenario;
import static modele.LectureFichierQuete.lectureScenarios;


public class HBoxRoot extends HBox {
    private static GridPaneSolution chGridPaneSolution;
    private static VBoxAffichageSolution chVBoxAffichageSolution;
    private static VBoxAffichageScenario chVBoxAffichageScenario;
    private static Scenario chSc;

    private static Joueur chJoueur = new Joueur();
    private static Solution chSol;
    private static Controleur chControleur;
    private static LectureFichierQuete chLectureFichierQuete;

    public HBoxRoot(){
        super(30);
        //File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_0.txt");
        //chSc = LectureFichierQuete.lecture(file);
        //chSol = new Solution(chSc,chJoueur);
        //chSol.efficace();
        chGridPaneSolution = new GridPaneSolution();
        chVBoxAffichageSolution = new VBoxAffichageSolution(chJoueur.getQueteAcc());
        chLectureFichierQuete = new LectureFichierQuete();
        chVBoxAffichageScenario = new VBoxAffichageScenario(chLectureFichierQuete.lectureScenarios());
        chControleur = new Controleur();
        getChildren().addAll(chVBoxAffichageScenario,chGridPaneSolution, chVBoxAffichageSolution);
    }

    public static GridPaneSolution getChGridPaneSolution() {return chGridPaneSolution;}
    public static VBoxAffichageScenario getChVBoxAffichageScenario() { return chVBoxAffichageScenario;}
    public static VBoxAffichageSolution getChVBoxAffichageSolution(){return chVBoxAffichageSolution;}
    public static Scenario getChSc(){return chSc;}
    public static Joueur getChJoueur(){return chJoueur;}
    public static Solution getChSolution(){return chSol;}
    public static Controleur getChControleur() { return chControleur;}
    public static LectureFichierQuete getLectureFichierQuete() { return chLectureFichierQuete;
    }
}
