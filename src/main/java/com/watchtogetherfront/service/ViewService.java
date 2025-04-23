package com.watchtogetherfront.service;

import com.watchtogetherfront.controller.ClientController;
import com.watchtogetherfront.utils.UserMenuOptions;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewService {

    private final ObjectProperty<UserMenuOptions> clientSelectedMenuItem;

    public ViewService() {
        this.clientSelectedMenuItem = new SimpleObjectProperty<>();

    }

    public ObjectProperty<UserMenuOptions> getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }


    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);

        createStage(loader);
    }

    public void showDashboard() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/menu.fxml"));
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
        stage.setMinWidth(1300);
        stage.setFullScreen(true);

        stage.show();
    }





}