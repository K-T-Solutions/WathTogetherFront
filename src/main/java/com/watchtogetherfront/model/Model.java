package com.watchtogetherfront.model;

import com.watchtogetherfront.service.ViewService;

public class Model {
    private static Model model;
    private final ViewService viewService;


    private Model() {
        this.viewService = new ViewService();


    }

    public static Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewService getViewService() {
        return viewService;
    }

}