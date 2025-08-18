package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;

import java.util.Optional;

public class IdByALL {

    public static Optional<String> ByALL(String Username_B5, String State_B5, String Country_B5, int Age_B5){

        return (randomElements.elementRadom15( Username_B5 )
                                +randomElements.elementRadom16(Age_B5)
                                + randomElements.elementRadom17( State_B5 )
                                + randomElements.elementRadom18( Country_B5 ).toString().toUpperCase()).describeConstable();
    }
}