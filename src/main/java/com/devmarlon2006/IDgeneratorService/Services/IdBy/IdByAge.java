package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;

public class IdByAge {

    public static String ByAge(int Age_B2){

        return  randomElements.elementRandom4( Age_B2 ).toString().charAt( 0 )
                + randomElements.elementRandom5( Age_B2 )
                + randomElements.elementRandom6( Age_B2 ).toString().charAt( 0 )
                + randomElements.elementRandom7();

    }
}
