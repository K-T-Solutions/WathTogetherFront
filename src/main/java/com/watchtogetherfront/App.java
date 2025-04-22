package com.watchtogetherfront;

import com.watchtogetherfront.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(getClass().getResource("/Images/menuBackgroundImg2.jpg"));
        Model.getInstance().getViewService().showDashboard();
    }
}

