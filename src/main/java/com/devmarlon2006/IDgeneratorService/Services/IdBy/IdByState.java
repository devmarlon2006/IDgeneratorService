package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;


public class IdByState {

    /*
    Metodo Instavel
    Causa: Caso receba um dado que contenha um némeros ele não retornara o erro esperado,
    gerando assim um ID invalido.
    */

    public static Optional<String> ByState(String State_3){

        Erros textErro =  Erros.STATE_ERRO;

        if(ErroMethods.Method1(State_3)){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        if (ErroMethods.Method2(State_3)){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        return (randomElements.elementRandom8( State_3, 0 )
                + randomElements.elementRandom8( State_3, 1 ).toString()
                + randomElements.elementRandom9( State_3)
                + randomElements.elementRandom10(State_3)).describeConstable();


    }
}
