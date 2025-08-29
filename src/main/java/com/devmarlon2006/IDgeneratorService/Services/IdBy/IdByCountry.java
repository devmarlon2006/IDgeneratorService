package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;



public class IdByCountry {

    /*
    Status: Funcionando
    */

    public static Optional<String> ByCountry(String Country){

        if(ErroMethods.Method1( Country ) || ErroMethods.Method2( Country ) || ErroMethods.Method3( Country ) || ErroMethods.Method4( Country )){
            return Erros.COUNTRY_ERRO.name().describeConstable();
        }

        return (randomElements.elementRandom11( Country )
                        + randomElements.elementRadom12( Country )
                        + randomElements.elementRadom13( Country)
                        + randomElements.elementRadom14( Country)).describeConstable();

    }
}
