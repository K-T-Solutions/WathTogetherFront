package com.watchtogetherfront.controller;

import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import java.net.URL;
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
    public ImageView friends_imageView;
    public AnchorPane anchorPane;
    public HBox main_hbox;
    public HBox settings_hbox;
    public Button setting_btn;
    public ImageView settings_img;
    public ImageView logo_img;
    public HBox rigth_btns_hbox;
    public Button logout_btn;
    public ImageView logout_img;
    public Button messenger_btn;
    public ImageView messanger_img;
    public Button profile_btn;
    public ImageView profile_img;
    public Button join_btn;
    public ImageView join_img;
    public Button host_btn;
    public ImageView host_img;
    public Button notifications_btn;
    public ImageView notifications_img;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        layoutManager();




    }

    private void layoutManager() {
        main_hbox.prefWidthProperty().bind(anchorPane.widthProperty().multiply(1));
        settings_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.052));
        logo_img.prefWidth(54);
        center_btns_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.5));
        rigth_btns_hbox.prefWidthProperty().bind(main_hbox.widthProperty().multiply(0.41));
        settings_img.setFitWidth(40);

        messenger_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
        messanger_img.fitWidthProperty().bind(messenger_btn.widthProperty().multiply(1));

        friends_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
        friends_imageView.fitWidthProperty().bind(friends_btn.widthProperty().multiply(1));

        profile_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
        profile_img.fitWidthProperty().bind(profile_btn.widthProperty().multiply(1));

        join_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.125));
        join_img.fitWidthProperty().bind(join_btn.widthProperty().multiply(1));

        host_btn.prefWidthProperty().bind(center_btns_hbox.widthProperty().multiply(0.075));
        host_img.fitWidthProperty().bind(host_btn.widthProperty().multiply(1));
    }



}
