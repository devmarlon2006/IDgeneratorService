package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

import lombok.NoArgsConstructor;

import java.util.function.UnaryOperator;

@NoArgsConstructor(staticName = "private")
public class ErroMethods {

    // Para tamanhos de nomes invalidos.
    public static boolean MethodInvalidSize(String name){
        return name.length() < 3 || name.length() > 125;
    }

    // Para nomes com numeros invalidos.
    public static boolean InvalidNumberOnName(String name){

        for (char caractere : name.toCharArray()) {
            if (Character.isDigit(caractere)) {
                return true;
            }
        }
        return false;

    }

    // Para nomes com caracteres especiais inválidos.
    public static boolean InvalidCharacter(String name){
        return !name.matches( "[a-zA-Z0-9 ]+");
    }

    //Para Numeros que contem letras.
    public static boolean IntContainsinvalideChars(String Parameter){
        return !Parameter.matches( "[0-9]+");
    }

    // Para elementos que voltaram um erro.
    public static boolean MethodErro(String name){
        return name.equals("ERRO");
    }

    // Para limites de idade.
    public static boolean AgeLimit(int Parameter){
        return Parameter <= 0 || Parameter > 125;
    }

    // Para parametros nulos.
    public static boolean NullParameter(String Parameter){
        return Parameter == null;
    }


}
