package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.devmarlon2006.IDgeneratorService.Services.IDelemntAllowed;

import java.util.Optional;

public class IdByName {

    /*
    Status: Funcionando
     */

    public static Optional<String> ByName(String Name_B1){

        Erros textErro =  Erros.NAME_ERRO;

        if(ErroMethods.Method1( Name_B1 ) || ErroMethods.Method2( Name_B1 ) || ErroMethods.Method3( Name_B1 )){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        return (IDelemntAllowed.AllowedCharacter(Name_B1).toString()
                        + randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 )
                        + randomElements.element2Con(5, Name_B1).charAt( 0 )
                        + randomElements.elementRandom3( Name_B1 ).charAt( 0 )).describeConstable();

    }
}
