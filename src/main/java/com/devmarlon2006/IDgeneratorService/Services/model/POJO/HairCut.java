package com.devmarlon2006.IDgeneratorService.Services.model.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HairCut extends SuperclassModel{

    private String id;
    private String Name;
    private int aleatoryNumber;
    private String price;


    @Override
    public void setID(String ID) {
        this.id = (ID != null) ? ID : "";
    }
}
