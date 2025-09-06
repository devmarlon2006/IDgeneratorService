package com.devmarlon2006.IDgeneratorService.Services.model.POJO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// POJO -> Plain Old Java Object

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends SuperclassModel{



    @NotBlank(message = "O nome é obrigatório - (Username)")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres - (Username)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O campo nome não pode conter números ou caracteres especiais - (Username)")
    private String name;

    private int age;

    @NotBlank(message = "Campo obrigatório - (Country)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres - (Country)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O Campo de estado não pode conter números ou caracteres especiais - (Country)")
    private String bornCountry;

    @NotBlank(message = "Campo obrigatório - (State)")
    @Size(min = 3 , max = 100, message = "Campo deve ter entre 3 e 100 caracteres - (State)")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O Campo pais não pode conter números ou caracteres especiais - State")
    private String stateBornCountry;

    private String id;

    @Override
    public void setID(String ID) {
        this.id = (ID != null) ? ID : "";
    }

}
