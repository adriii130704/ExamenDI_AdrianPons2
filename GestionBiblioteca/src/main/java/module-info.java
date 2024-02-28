module com.example.gestionbiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionbiblioteca to javafx.fxml;
    exports com.example.gestionbiblioteca;
}