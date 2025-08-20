package com.devmarlon2006.IDgeneratorService.Services.model.User;

import lombok.Getter;

// POJO -> Plain Old Java Object


@Getter
public class InfoClassElements {

    private final String name;
    private final int age;
    private final String bornCountry;
    private final String stateBornCountry;
    private String ID;

   public void setID(String ID){
        this.ID = (ID != null) ? ID : "";
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


    public boolean isNull(){
        return this.ID == null;
    }

    public boolean isNotNull(){
        return !isNull();
    }

    public boolean isIDNull(){
       return this.ID.isEmpty();
    }

    public boolean isIDNotNull(){
       return !isIDNull();
    }

    public boolean isNameNull(){
       return this.name.isEmpty();
    }

    public boolean isNameNotNull(){
       return !isNameNull();
    }

    public boolean isAgeNull(){
       return this.age <= 0;
    }

    public boolean isAgeNotNull(){
       return !isAgeNull();
    }

    public boolean isBornCountryNull(){
       return this.bornCountry.isEmpty();
    }

    public boolean isBornCountryNotNull(){
       return !isBornCountryNull();
    }

    public boolean isStateBornCountryNull(){
       return this.stateBornCountry.isEmpty();
    }

    public boolean isStateBornCountryNotNull(){
       return !isStateBornCountryNull();
    }

    public boolean isAllNull(){
       return isIDNull() && isNameNull() && isAgeNull() && isBornCountryNull() && isStateBornCountryNull();
    }

    public boolean isAllNotNull(){
       return !isAllNull();
    }

}















