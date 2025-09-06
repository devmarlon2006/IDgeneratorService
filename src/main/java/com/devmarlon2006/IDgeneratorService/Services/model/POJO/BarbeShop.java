package com.devmarlon2006.IDgeneratorService.Services.model.POJO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BarbeShop extends SuperclassModel {

    private String id;
    private String name;
    private String country;
    private String city;
    private String state;

    @Override
    public void setID(String ID) {
        if (ID == null){
            return;
        }
        this.id = ID;
    }

}
