package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;

public class IdByALL {

    /*
    Metodo Instavel
    Causa: Caso receba um dado que contenha um némeros ele não retornara o erro esperado,
    gerando assim um ID invalido.
     */

    public static Optional<String> ByALL(String Username_B5, String State_B5, String Country_B5, int Age_B5){

        boolean Valid;
        boolean valid2;

        Erros textErro =  Erros.ALL_ERRO;

        try {
            Integer.parseInt( Integer.toString( Age_B5) );
            valid2 = false;
        }catch (NumberFormatException e){
            valid2 = true;
        }

        try{

            Integer.parseInt( Country_B5 );
            Integer.parseInt( State_B5 );
            Integer.parseInt( Username_B5 );

            Valid = true;

        }catch (NumberFormatException e){
            Valid = false;
        }

        if (Valid || valid2){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM() ).describeConstable();
        }

        return (randomElements.elementRadom15( Username_B5 )
                                +randomElements.elementRadom16(Age_B5)
                                + randomElements.elementRadom17( State_B5 )
                                + randomElements.elementRadom18( Country_B5 ).toString().toUpperCase()).describeConstable();
    }
}