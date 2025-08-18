package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;

public class IdByState {
    public static String ByState(String State_3){

        return randomElements.elementRandom8( State_3, 0 )
        + randomElements.elementRandom8( State_3, 1 ).toString()
        + randomElements.elementRandom9( State_3)
        + randomElements.elementRandom10(State_3);


    }
}
