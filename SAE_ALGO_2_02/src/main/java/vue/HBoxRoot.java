package vue;

import javafx.scene.layout.HBox;
import modele.Joueur;
import modele.LectureFichierQuete;
import modele.Scenario;
import modele.Solution;

import java.io.File;

import static modele.LectureFichierQuete.lecture;

public class HBoxRoot extends HBox {
    private static GridPaneSolution chGridPaneSolution;
    private static VBoxAffichageSolution chVBoxAffichageSolution;
    private static VBoxAffichageScenario chVBoxAffichageScenario;
    private Scenario chSc;

    private Joueur chJoueur = new Joueur();
    private Solution chSol;

    public HBoxRoot(){
        super(30);
        File file = new File("SAE_ALGO_2_02"+File.separator+"Scenarios"+File.separator+"scenario_0.txt");
        chSc = LectureFichierQuete.lecture(file);
        chSol = new Solution(chSc,chJoueur);
        chSol.efficace();
        chGridPaneSolution = new GridPaneSolution();
        chVBoxAffichageSolution = new VBoxAffichageSolution(chJoueur.getQueteAcc());
        chVBoxAffichageScenario = new VBoxAffichageScenario(chSc.getScenario());
        getChildren().addAll(chVBoxAffichageScenario,chGridPaneSolution, chVBoxAffichageSolution);
    }
}
