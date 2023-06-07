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
import java.util.TreeMap;

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
            TreeMap<Integer, Quete> sc = scenario.getScenario();
            for (Quete quete : sc.values()) {
                chListeQuete.add(quete);
            }
        }

        if (event.getSource() instanceof ComboBox<?>){
            int numScenario = solutionPane.getNumScenario();
            ArrayList<Quete> quetes = fichierScenario.getQueteDuScenar(numScenario);
            System.out.println(quetes);
            affichageScenario.update(numScenario,quetes);
        }

    }
}
