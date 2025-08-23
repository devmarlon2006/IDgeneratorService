package com.devmarlon2006.IDgeneratorService.Services.model.User;

import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


   public String getName(){
       Erros erro = Erros.NAME_ERRO;

       if (name == null || name.isEmpty()){
           return erro.formatErro( erro.getCODIGO(), erro.getMENSAGEM() );
       }

        return name;
   }




    public InfoClassElements(int age, String name, String bornCountry, String stateBornCountry, String ID) {
        this.age = age;
        this.name = name;
        this.bornCountry = bornCountry;
        this.stateBornCountry = stateBornCountry;
        this.ID = ID;
    }


    @Override
    @JsonIgnore
    public String toString() {
        return "InfoClassElements{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bornCountry='" + bornCountry + '\'' +
                ", stateBornCountry='" + stateBornCountry + '\'' +
                '}';
    }


    @JsonIgnore
    public boolean isNull(){
        return this.ID == null;
    }

    @JsonIgnore
    public boolean isNotNull(){
        return !isNull();
    }

    @JsonIgnore
    public boolean isIDNull(){
       return this.ID.contains( "ERRO" );
    }

    @JsonIgnore
    public boolean isIDNotNull(){
       return !isIDNull();
    }

    @JsonIgnore
    public boolean isNameNull(){
       return this.name.isEmpty();
    }

    @JsonIgnore
    public boolean isNameNotNull(){
       return !isNameNull();
    }

    @JsonIgnore
    public boolean isAgeNull(){
       return this.age <= 0;
    }

    @JsonIgnore
    public boolean isAgeNotNull(){
       return !isAgeNull();
    }

    @JsonIgnore
    public boolean isBornCountryNull(){
       return this.bornCountry.isEmpty();
    }

    @JsonIgnore
    public boolean isBornCountryNotNull(){
       return !isBornCountryNull();
    }

    @JsonIgnore
    public boolean isStateBornCountryNull(){
       return this.stateBornCountry.isEmpty();
    }

    @JsonIgnore
    public boolean isStateBornCountryNotNull(){
       return !isStateBornCountryNull();
    }

    @JsonIgnore
    public boolean isAllNull(){
       return isIDNull() && isNameNull() && isAgeNull() && isBornCountryNull() && isStateBornCountryNull();
    }

    @JsonIgnore
    public boolean isAllNotNull(){
       return !isAllNull();
    }

}
