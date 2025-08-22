package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

public class ErroMethods {

    public static boolean Method1(String name){
        return name.length() <= 3;
    }

    public static boolean Method2(String name){

        for (char caractere : name.toCharArray()) {
            if (Character.isDigit(caractere)) {
                return true;
            }
        }
        return false;

    }

    public static boolean Method3(String name){
        return !name.matches("[a-zA-Z0-9]+");
    }
}
