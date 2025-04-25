package com.watchtogetherfront.controller;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuController implements Initializable {


    public Button friends_btn;
    public HBox center_btns_hbox;
    public AnchorPane anchorPane;
    public HBox main_hbox;
    public HBox settings_hbox;
    public Button setting_btn;
    public ImageView settings_img;
    public ImageView logo_img;
    public HBox rigth_btns_hbox;
    public Button logout_btn;
    public Button messenger_btn;
    public Button profile_btn;
    public Button join_btn;
    public Button host_btn;
    public Button notifications_btn;
    public ImageView notifications_img;
    public ImageView logout_img;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        layoutManager();
        onButtonClicked();
        setImages();



    }

    private void onButtonClicked() {
        logout_btn.setOnAction(event -> onLogout());
    }

    private void onLogout() {
        Stage stage = (Stage) logout_btn.getScene().getWindow();
        stage.close();
    }

    private void setImages() {
        Image notificationsNormal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/MainMenu/Buttons/notificationsBtn.png")));
        Image notificationsHover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/MainMenu/Buttons/notificationsBtnHover.png")));
        Image exitNormal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/MainMenu/Buttons/exitBtn.png")));
        Image exitHover = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/MainMenu/Buttons/exitBtnHover.png")));


        notifications_btn.setOnMouseEntered(event -> {
            notifications_img.setImage(notificationsHover);
        });

        notifications_btn.setOnMouseExited(event -> {
            notifications_img.setImage(notificationsNormal);
        });

        logout_btn.setOnMouseEntered(event -> {
            logout_img.setImage(exitHover);
        });

        logout_btn.setOnMouseExited(event -> {
            logout_img.setImage(exitNormal);
        });



    }


    private void layoutManager() {
        main_hbox.prefWidthProperty().bind(anchorPane.widthProperty().multiply(1));
        settings_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.052));
        logo_img.prefWidth(54);
        center_btns_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.5));
        rigth_btns_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.41));
        settings_img.setFitWidth(40);


//        messenger_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
//        messanger_img.fitWidthProperty().bind(messenger_btn.widthProperty().multiply(1));
//
//        friends_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
//        friends_imageView.fitWidthProperty().bind(friends_btn.widthProperty().multiply(1));
//
//        profile_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
//        profile_img.fitWidthProperty().bind(profile_btn.widthProperty().multiply(1));
//
//        join_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
//        join_img.fitWidthProperty().bind(join_btn.widthProperty().multiply(1));
//
//        host_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.075));
//        host_img.fitWidthProperty().bind(host_btn.widthProperty().multiply(1));
    }



}
