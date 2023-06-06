package vue;

import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private static GridPaneSolution chGridPaneSolution;
    private static VBoxAffichageSolution chVBoxAffichageSolution;

    public HBoxRoot(){
        super(30);
        chGridPaneSolution = new GridPaneSolution();
        chVBoxAffichageSolution = new VBoxAffichageSolution(null);
        getChildren().addAll(chGridPaneSolution, chVBoxAffichageSolution);
    }
}
