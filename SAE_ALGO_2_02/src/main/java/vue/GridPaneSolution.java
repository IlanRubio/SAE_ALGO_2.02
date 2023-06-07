package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import static modele.ConstanteScenario.*;

/**
 * Cette classe représente un formulaire de réservation sous forme de grille.
 * Elle hérite de la classe GridPane.
 */
public class GridPaneSolution extends GridPane {
    private ComboBox chChoixScenario;
    private Label chLabelSolution;
    private ToggleGroup chRadioGroup;

    /**
     * Constructeur de la classe GridPaneFormulaireReservation.
     * Initialise les éléments graphiques du formulaire.
     */
    public GridPaneSolution(){
        int ligne = 0;
        chLabelSolution = new Label("Choix du scenario et de la solution");
        GridPane.setHalignment(chLabelSolution, HPos.CENTER);
        this.add(chLabelSolution,0,ligne++,6,1);

        Separator sepateurSce = new Separator();
        sepateurSce.setPadding(new Insets(10,0,5,0));
        this.add(sepateurSce,0,ligne++,6,1);

        Label labScenario = new Label("Scenario"); // Choix du Scenario
        this.add(labScenario,0,ligne,1,1);
        chChoixScenario = peupleComboBox(NUM_SCENARIO);
        this.add(chChoixScenario,4,ligne++);

        Label labSolution = new Label("Solution"); // Choix de la Solution
        this.add(labSolution,0,ligne,1,1);
        chRadioGroup = new ToggleGroup();

        RadioButton radioButtonEfficace = new RadioButton(SOLUTION[0]);
        radioButtonEfficace.setUserData(SOLUTION[0]);
        radioButtonEfficace.setToggleGroup(chRadioGroup);
        this.add(radioButtonEfficace,1,ligne++,2,1);

        RadioButton radioButtonExhaistive = new RadioButton(SOLUTION[1]);
        radioButtonExhaistive.setUserData(SOLUTION[1]);
        radioButtonExhaistive.setToggleGroup(chRadioGroup);
        this.add(radioButtonExhaistive,1,ligne++,2,1);

        Separator sepateurBouton = new Separator();
        sepateurBouton.setPadding(new Insets(10,0,5,0));
        this.add(sepateurBouton,0,ligne++,6,1);

        Button buttonAnnuler = new Button("Annuler");
        this.add(buttonAnnuler,2,ligne,2,1);
        Button buttonGenerer = new Button("Generer");
        this.add(buttonGenerer,4,ligne);


        chChoixScenario.setOnAction(HBoxRoot.getChControleur());
        buttonGenerer.setOnAction(HBoxRoot.getChControleur());
        buttonAnnuler.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                reset();
            }
        });
        reset();

    }

    /**
     * Crée et peuple une ComboBox avec les options fournies.
     *
     * @param numScena les options à ajouter à la ComboBox
     * @return la ComboBox peuplée avec les options
     */
    private ComboBox<Integer> peupleComboBox(Integer[] numScena){
        ComboBox <Integer> comboBox = new ComboBox<>();
        for (Integer numero:numScena){
            comboBox.getItems().add(numero);
        }
        return comboBox;
    }

    public void reset(){
        chRadioGroup.getToggles().get(0).setSelected(true);
        chChoixScenario.setValue(NUM_SCENARIO[0]);
    }

    public int getNumScenario() {
        return (int) chChoixScenario.getValue();
    }
}
