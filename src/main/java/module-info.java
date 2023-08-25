module com.example.demowordy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demowordy to javafx.fxml;
    exports com.example.demowordy;
}