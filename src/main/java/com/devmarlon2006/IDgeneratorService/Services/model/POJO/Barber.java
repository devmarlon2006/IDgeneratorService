package com.devmarlon2006.IDgeneratorService.Services.model.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//POJO -> Plain Old Java Object

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Barber extends SuperclassModel {

    private String id;
    private String name;
    private int age;
    private String country;
    private String state;

    public void setID(String ID){
        if (ID == null){
            return;
        }
        this.id = ID;
    }
}
