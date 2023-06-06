package controleur;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import modele.Quete;
import modele.Scenario;
import vue.GridPaneSolution;
import vue.HBoxRoot;
import vue.VBoxAffichageScenario;

import java.util.ArrayList;
import java.util.TreeMap;

public class Controleur implements EventHandler {
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
            afficheScenario.updateScenario(chListeQuete);
        }

    }
}
