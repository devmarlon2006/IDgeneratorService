package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.devmarlon2006.IDgeneratorService.Services.IDelemntAllowed;

import java.util.Optional;

public class IdByName {

    /*
    Metodo Estavel :)
     */

    public static Optional<String> ByName(String Name_B1){

        boolean isNumber;
        Erros textErro =  Erros.NAME_ERRO;

        try {
            Integer.parseInt(Name_B1);
            isNumber =  true;
        }catch (NumberFormatException e){
            isNumber = false;
        }

        if(Name_B1.length() < 3|| Name_B1.length() > 100){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        if(isNumber){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        return (IDelemntAllowed.AllowedCharacter(Name_B1).toString()
                        + randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 )
                        + randomElements.element2Con(5, Name_B1).charAt( 0 )
                        + randomElements.elementRandom3( Name_B1 ).charAt( 0 )).describeConstable();

    }
}
