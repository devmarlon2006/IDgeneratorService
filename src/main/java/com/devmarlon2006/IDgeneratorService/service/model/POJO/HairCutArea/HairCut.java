package com.devmarlon2006.IDgeneratorService.service.model.POJO.HairCutArea;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HairCut{

    private String id;
    private String Name;
    private int aleatoryNumber;
    private String price;

    public void setID(String ID) {
        this.id = (ID != null) ? ID : "";
    }
}
