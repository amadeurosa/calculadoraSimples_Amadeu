module org.example.calculadoraamadeu {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculadoraamadeu to javafx.fxml;
    exports org.example.calculadoraamadeu;
}