package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;



public class IdByCountry {

    /*
    Metodo Instavel
    Causa: Caso receba um dado que contenha um némeros ele não retornara o erro esperado,
    gerando assim um ID invalido.
    */

    public static Optional<String> ByCountry(String Country){

        boolean Valid;
        Erros textErro =  Erros.COUNTRY_ERRO;

        try {
            Integer.parseInt(Country);
            Valid = true;
        }catch (NumberFormatException e){
            Valid = false;
        }

        if(Country.length() < 2|| Country.length() > 50){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        if (Valid){
            return textErro.formatErro( textErro.getCODIGO(), textErro.getMENSAGEM()).describeConstable();
        }

        return (randomElements.elementRandom11( Country )
                        + randomElements.elementRadom12( Country )
                        + randomElements.elementRadom13( Country)
                        + randomElements.elementRadom14( Country)).describeConstable();

    }
}
