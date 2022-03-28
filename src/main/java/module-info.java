module com.example.projetimpact {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetimpact to javafx.fxml;
    exports com.example.projetimpact;
}