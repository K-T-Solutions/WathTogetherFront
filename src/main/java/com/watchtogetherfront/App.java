package com.watchtogetherfront;

import com.watchtogetherfront.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
       // Model.getInstance().getViewService().showClientWindow();
        Model.getInstance().getViewService().showDashboard();

    }
}

