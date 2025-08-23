package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;



public class IdByAge {


    /*
    Status: Instavel
    */

    public static Optional <String> ByAge(int Age_B2){

        boolean Valid;
        Erros textErro =  Erros.AGE_ERRO;

        try{

            Integer.parseInt( Integer.toString( Age_B2 ) );
            Valid = false;
        }catch (NumberFormatException e){
            Valid = true;
        }

        if (Age_B2 < 0 || Age_B2 > 125){
            Age_B2 = 0;
        }

        if(ErroMethods.Method5( Age_B2 )){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        if (Valid){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }


            return (randomElements.elementRandom4( Age_B2 ).charAt( 0 )
                                + randomElements.elementRandom5( Age_B2 )
                                + randomElements.elementRandom6( Age_B2 ).toString().charAt( 0 )
                                + randomElements.elementRandom7(Age_B2)).describeConstable();

        }
    }