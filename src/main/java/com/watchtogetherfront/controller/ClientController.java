package com.watchtogetherfront.controller;

import com.watchtogetherfront.model.Model;
import com.watchtogetherfront.utils.UserMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewService().getClientSelectedMenuItem().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                default -> Model.getInstance().getViewService().getClientSelectedMenuItem().set(UserMenuOptions.DASHBOARD);
            }
        });

    }
}
