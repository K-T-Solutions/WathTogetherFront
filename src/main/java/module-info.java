module com.watchtogetherfront.watchtogetherfront {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.watchtogetherfront to javafx.fxml;
    exports com.watchtogetherfront;
}