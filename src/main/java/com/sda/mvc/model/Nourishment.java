package com.sda.mvc.model;

public enum Nourishment {

    Nourishment("saturated"), HUNGRY("hungry"), STRAVING("straving");

    private String title;

    Nourishment(String title){this.title=title;}
}
