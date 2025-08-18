package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.IDelemntAllowed;

public class IdByName {

    public static String ByName(String Name){

        return IDelemntAllowed.AllowedCharacter(Name).toString()
                + randomElements.element2Con( 7 ).charAt( 0 )
                + randomElements.element2Con(5).charAt( 0 )
                + randomElements.elementRandom3( Name ).charAt( 0 );

    }
}
