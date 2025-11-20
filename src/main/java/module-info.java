module org.example.progra {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.progra to javafx.fxml;
    exports org.example.progra;
}