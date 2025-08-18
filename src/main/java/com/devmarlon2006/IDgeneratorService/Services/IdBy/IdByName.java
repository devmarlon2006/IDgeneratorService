package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.IDelemntAllowed;

public class IdByName {

    public static String ByName(String Name_B1){

        return IDelemntAllowed.AllowedCharacter(Name_B1).toString()
                + randomElements.element2Con( 7 ).charAt( 0 )
                + randomElements.element2Con(5).charAt( 0 )
                + randomElements.elementRandom3( Name_B1 ).charAt( 0 );

    }
}
