package controleur;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;
import modele.*;
import vue.GridPaneSolution;
import vue.HBoxRoot;
import vue.VBoxAffichageScenario;
import vue.GridPaneAffichageSolution;

import java.util.ArrayList;

public class Controleur implements EventHandler {

    VBoxAffichageScenario affichageScenario = HBoxRoot.getChVBoxAffichageScenario();
    GridPaneAffichageSolution affichageSolution = HBoxRoot.getChVBoxAffichageSolution();
    LectureFichierQuete fichierScenario = HBoxRoot.getLectureFichierQuete();
    GridPaneSolution solutionPane = HBoxRoot.getChGridPaneSolution();
    Solution solution;
    Joueur joueur = HBoxRoot.getChJoueur();
    ArrayList<Quete> chListeQuete=new ArrayList<Quete>();

    @Override
    public void handle(Event event) {
        Scenario scenario = HBoxRoot.getChSc();
        GridPaneSolution solutionPane = HBoxRoot.getChGridPaneSolution();
        VBoxAffichageScenario afficheScenario= HBoxRoot.getChVBoxAffichageScenario();

        if (event.getSource() instanceof Button){
            int numScenario = solutionPane.getNumScenario();
            Scenario scenar= fichierScenario.getScenario(numScenario);
            ArrayList<Quete> quetes = fichierScenario.getQueteDuScenar(numScenario);
            afficheScenario.update(numScenario,quetes);
            if(solutionPane.getSolution()=="Efficace"){
                joueur.reset();
                solution = new Solution(scenario, joueur);
                solution.efficace();
                affichageSolution.update(joueur, joueur.getQueteAcc());
            }
            else{
                joueur.reset();
                solution = new Solution(scenario, joueur);
                solution.exhaustive();
                affichageSolution.update(joueur,joueur.getQueteAcc());
            }
        }

        if (event.getSource() instanceof ComboBox<?>){
            int numScenario = solutionPane.getNumScenario();
            ArrayList<Quete> quetes = fichierScenario.getQueteDuScenar(numScenario);
            affichageScenario.update(numScenario,quetes);
        }

    }
}
