module com.watchtogetherfront.watchtogetherfront {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.watchtogetherfront to javafx.fxml;
    exports com.watchtogetherfront;
    exports com.watchtogetherfront.controller;
    opens com.watchtogetherfront.controller to javafx.fxml;
}