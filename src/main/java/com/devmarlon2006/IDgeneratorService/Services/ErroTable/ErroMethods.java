package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

public class ErroMethods {

    // Para tamanhos de nomes invalidos.
    public static boolean Method1(String name){
        return name.length() < 3 || name.length() > 125;
    }

    // Para nomes com numeros invalidos.
    public static boolean Method2(String name){

        for (char caractere : name.toCharArray()) {
            if (Character.isDigit(caractere)) {
                return true;
            }
        }
        return false;

    }

    // Para nomes com caracteres especiais invalidos.
    public static boolean Method3(String name){
        return !name.matches( "[a-zA-Z0-9 ]+");
    }
}
