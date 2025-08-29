package com.devmarlon2006.IDgeneratorService.Services.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

// POJO -> Plain Old Java Object

@Getter
@Setter
@Entity
@Table(name = "app_user")
public class User {

    @Id
    private String ID;

    @NotBlank(message = "O nome é obrigatório - (Username)")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres - (Username)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O campo nome não pode conter números ou caracteres especiais - (Username)")
    private String name;

    @NotBlank(message = "A idade e Obrigatória - (Age)" )
    @Size(min = 1, max = 3, message = "A idade deve ter entre 1 e 3 caracteres - (Age)")
    @Pattern( regexp = "[0-9]+$", message = "A o campo Idade deve conter apenas números - (Age)")
    private String age;

    @NotBlank(message = "Campo obrigatório - (Country)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres - (Country)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O Campo de estado não pode conter números ou caracteres especiais - (Country)")
    private String bornCountry;

    @NotBlank(message = "Campo obrigatório - (State)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres - (State)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O Campo pais não pode conter números ou caracteres especiais - State")
    private String stateBornCountry;

    @Email(message = "Formato invalido - (E-mail)")
    @NotBlank(message = "E-amil obrigatório - (E-mail)")
    private String email;

    @NotBlank(message = "Campo obrigatório")
    private String password;

    public User(){}

    public void setID(String ID){
        this.ID = (ID != null) ? ID : "";
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

}
