package com.sda.mvc.model;

public enum Health {

    HEALTHY("health"), WOUNDED("wounded"), DEAD("dead");

    private String title;

    Health(String title){
        this.title=title;
    }
}
