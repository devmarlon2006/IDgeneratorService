package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroExepition;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;

public class IdByAge {

    public static Optional <String> ByAge(int Age_B2){

        boolean Valid;

        try{

            Integer.parseInt( Integer.toString( Age_B2 ) );
            Valid = true;
        }catch (NumberFormatException e){
            Valid = false;
        }

        if (Valid){
            throw new ErroExepition( Erros.AGE_ERRO );
        }


            return (randomElements.elementRandom4( Age_B2 ).toString().charAt( 0 )
                                + randomElements.elementRandom5( Age_B2 )
                                + randomElements.elementRandom6( Age_B2 ).toString().charAt( 0 )
                                + randomElements.elementRandom7(Age_B2)).describeConstable();

        }



    }

