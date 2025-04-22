package com.watchtogetherfront.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewService {



    public void showDashboard() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/MainMenu/menu.fxml"));
        createStage(loader);
    }


    private void createStage(FXMLLoader loader) {
        Scene scene = null;

        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("WatchTogether");
        stage.setFullScreen(true);
        stage.show();
    }



}