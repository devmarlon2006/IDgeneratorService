package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;



public class IdByAge {


    /*
    Status: Instavel
    */

    public static Optional <String> ByAge(String Age_B2){

        Erros textErro =  Erros.AGE_ERRO;

        if (Integer.parseInt( Age_B2 )< 0 || Integer.parseInt( Age_B2 ) > 125){
            Age_B2 = "0";
        }

        if(ErroMethods.Method5( Integer.parseInt( Age_B2 ) )){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }


            return (randomElements.elementRandom4( Integer.parseInt( Age_B2 ) ).charAt( 0 )
                                + randomElements.elementRandom5( Integer.parseInt( Age_B2 ) )
                                + randomElements.elementRandom6( Integer.parseInt( Age_B2 ) ).toString().charAt( 0 )
                                + randomElements.elementRandom7( Integer.parseInt( Age_B2 ) )).describeConstable();

        }
    }