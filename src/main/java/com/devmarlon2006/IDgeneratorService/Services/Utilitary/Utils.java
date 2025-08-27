package com.devmarlon2006.IDgeneratorService.Services.Utilitary;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utils {

    //Sem Instâncias.
    private Utils(){}

    public static Consumer<String> Lower = System.out::println;
    public static UnaryOperator<String> UperCase = String::toUpperCase;
    public static UnaryOperator<String> LowerCase = String::toLowerCase;
}
