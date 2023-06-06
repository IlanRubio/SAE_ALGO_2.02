package vue;

import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private static GridPaneSolution chGridPaneSolution;

    public HBoxRoot(){
        super(30);
        chGridPaneSolution = new GridPaneSolution();
        getChildren().addAll(chGridPaneSolution);
    }
}
