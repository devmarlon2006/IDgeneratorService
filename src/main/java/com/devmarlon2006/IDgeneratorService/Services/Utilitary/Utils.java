package com.devmarlon2006.IDgeneratorService.Services.Utilitary;

import lombok.NoArgsConstructor;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

@NoArgsConstructor(staticName = "private")
public class Utils {

    public static Consumer<String> Lower = System.out::println;
    public static UnaryOperator<String> UperCase = String::toUpperCase;
    public static UnaryOperator<String> LowerCase = String::toLowerCase;

}
