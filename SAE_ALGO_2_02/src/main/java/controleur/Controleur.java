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

    VBoxAffichageScenario affichageScenario;
    GridPaneAffichageSolution affichageSolution;
    LectureFichierQuete fichierScenario;
    GridPaneSolution solutionPane;
    Solution solution;
    Joueur joueur;
    @Override
    public void handle(Event event) {
        affichageScenario = HBoxRoot.getChVBoxAffichageScenario();
        affichageSolution = HBoxRoot.getChVBoxAffichageSolution();
        fichierScenario = HBoxRoot.getLectureFichierQuete();
        solutionPane = HBoxRoot.getChGridPaneSolution();
        joueur = HBoxRoot.getChJoueur();
        Scenario scenario = HBoxRoot.getChSc();
        GridPaneSolution solutionPane = HBoxRoot.getChGridPaneSolution();
        VBoxAffichageScenario afficheScenario= HBoxRoot.getChVBoxAffichageScenario();

        if (event.getSource() instanceof Button){
            int numScenario = solutionPane.getNumScenario();
            Scenario scenar =  new Scenario();
            scenar= fichierScenario.getScenario(numScenario);
            if(solutionPane.getSolution().equals("Efficace")){
                joueur.reset();
                solution = new Solution(scenar, joueur);
                solution.efficace();
                affichageSolution.update(joueur, joueur.getQueteAcc());
            }
            else{
                joueur.reset();
                solution = new Solution(scenar, joueur);
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
