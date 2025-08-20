package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroExepition;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.devmarlon2006.IDgeneratorService.Services.IDelemntAllowed;

import java.util.Optional;

public class IdByName {

    public static Optional<String> ByName(String Name_B1){

        boolean isNumber;

        try {
            Integer.parseInt(Name_B1);
            isNumber =  true;
        }catch (NumberFormatException e){
            isNumber = false;
        }

        if(isNumber){
            throw new ErroExepition( Erros.NAME_ERRO );
        }

        return (IDelemntAllowed.AllowedCharacter(Name_B1).toString()
                        + randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 )
                        + randomElements.element2Con(5, Name_B1).charAt( 0 )
                        + randomElements.elementRandom3( Name_B1 ).charAt( 0 )).describeConstable();

    }
}
