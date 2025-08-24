package com.devmarlon2006.IDgeneratorService.Services.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

// POJO -> Plain Old Java Object

@Getter
public class InfoClassElements {

    @NotBlank(message = "O nome é obrigatório - (Username)")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome não pode conter números ou caracteres especiais.")
    private final String name;

    @NotBlank(message = "A idade e Obrigatória - (Age)" )
    @Size(min = 1, max = 3, message = "A idade deve ter entre 1 e 10 caracteres.")
    private final String age;

    @NotBlank(message = "Campo obrigatório - (Country)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres.")
    private final String bornCountry;

    @NotBlank(message = "Campo obrigatório - (State)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres.")
    private final String stateBornCountry;

    private String ID;

   public void setID(String ID){
        this.ID = (ID != null) ? ID : "";
   }
    public InfoClassElements(String age, String name, String bornCountry, String stateBornCountry, String ID) {
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
       return this.age.isEmpty();
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
