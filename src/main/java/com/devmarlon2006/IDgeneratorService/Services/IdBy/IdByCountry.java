package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;

import java.util.Optional;


public class IdByCountry {

    public static Optional<String> ByCountry(String Country){

        return (randomElements.elementRandom11( Country )
                        + randomElements.elementRadom12( Country )
                        + randomElements.elementRadom13( Country)
                        + randomElements.elementRadom14( Country)).describeConstable();

    }
}
