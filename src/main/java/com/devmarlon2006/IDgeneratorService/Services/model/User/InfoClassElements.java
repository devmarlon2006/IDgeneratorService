package com.devmarlon2006.IDgeneratorService.Services.model.User;

// POJO -> Plain Old Java Object

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoClassElements {

    private String name;
    private int age;
    private String bornCountry;
    private String stateBornCountry;
    private String ID;


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















