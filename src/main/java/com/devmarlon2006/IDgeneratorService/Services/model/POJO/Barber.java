package com.devmarlon2006.IDgeneratorService.Services.model.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//POJO -> Plain Old Java Object

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Barber extends SuperclassModel {

    private String id;
    private String name;
    private String age;
    private String country;
    private String state;
    private String email;
    private String password;

    public void setID(String ID){
        if (ID == null){
            return;
        }
        this.id = ID;
    }

}
