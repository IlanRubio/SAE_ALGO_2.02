module com.example.sae_algo_2_02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;

    opens com.example.sae_algo_2_02 to javafx.fxml;
    exports com.example.sae_algo_2_02;
    exports modele;
    exports vue;
    exports controleur;
}