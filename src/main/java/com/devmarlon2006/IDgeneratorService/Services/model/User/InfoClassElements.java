package com.devmarlon2006.IDgeneratorService.Services.model.User;

// POJO -> Plain Old Java Object

import lombok.Getter;
import lombok.Setter;

@Getter
public class InfoClassElements {

    private final String name;
    private final int age;
    private final String bornCountry;
    private final String stateBornCountry;
    private String ID;

    public void setID(String ID){
        this.ID = (ID != null) ? ID : "Erro no ID";
    }

    public InfoClassElements(int age, String name, String bornCountry, String stateBornCountry, String ID) {
        this.age = age;
        this.name = name;
        this.bornCountry = bornCountry;
        this.stateBornCountry = stateBornCountry;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "InfoClassElements{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bornCountry='" + bornCountry + '\'' +
                ", stateBornCountry='" + stateBornCountry + '\'' +
                '}';
    }
}















