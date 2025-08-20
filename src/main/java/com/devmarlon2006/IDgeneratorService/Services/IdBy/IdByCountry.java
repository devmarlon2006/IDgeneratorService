package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroExepition;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;

import java.util.Optional;


public class IdByCountry {

    public static Optional<String> ByCountry(String Country){

        boolean Valid;

        try {
            Integer.parseInt(Country);
            Valid = true;
        }catch (NumberFormatException e){
            Valid = false;
        }

        if (Valid){
            throw new ErroExepition( Erros.COUNTRY_ERRO );
        }

        return (randomElements.elementRandom11( Country )
                        + randomElements.elementRadom12( Country )
                        + randomElements.elementRadom13( Country)
                        + randomElements.elementRadom14( Country)).describeConstable();

    }
}
