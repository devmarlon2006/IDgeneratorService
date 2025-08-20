package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroExepition;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;

public class IdByState {
    public static Optional<String> ByState(String State_3){

        boolean VALID;

        try {
            Integer.parseInt(State_3);
            VALID = true;
        }catch (NumberFormatException e){
            VALID = false;
        }

        if (VALID){
            throw new ErroExepition( Erros.STATE_ERRO );
        }


        return (randomElements.elementRandom8( State_3, 0 )
                + randomElements.elementRandom8( State_3, 1 ).toString()
                + randomElements.elementRandom9( State_3)
                + randomElements.elementRandom10(State_3)).describeConstable();


    }
}
