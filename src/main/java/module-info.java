module com.example.numerosprimos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numerosprimos to javafx.fxml;
    exports com.example.numerosprimos;
}