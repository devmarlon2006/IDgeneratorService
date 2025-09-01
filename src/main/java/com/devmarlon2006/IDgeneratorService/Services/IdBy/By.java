package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.IDelemntAllowed;
import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;

import java.util.Optional;



public class By {

    public static Optional <String> ByAge(String Age_B2){

        if(ErroMethods.Method5( Integer.parseInt( Age_B2 ) )){
            return Optional.empty();
        }


            return (randomElements.elementRandom4( Integer.parseInt( Age_B2 ) ).charAt( 0 )
                                + randomElements.elementRandom5( Integer.parseInt( Age_B2 ) )
                                + randomElements.elementRandom6( Integer.parseInt( Age_B2 ) ).toString().charAt( 0 )
                                + randomElements.elementRandom7( Integer.parseInt( Age_B2 ) )).describeConstable();

        }

    public static Optional<String> ByALL(String Username_B5, String State_B5, String Country_B5, String Age_B5){

        if (ErroMethods.Method5( Integer.parseInt( Age_B5 ) ) || ErroMethods.Method4( Username_B5 ) || ErroMethods.Method4( State_B5 ) || ErroMethods.Method4( Country_B5)){
            return Optional.empty();
        }

        return (randomElements.elementRadom15( Username_B5 )
                +randomElements.elementRadom16( Integer.valueOf( Age_B5 ) )
                + randomElements.elementRadom17( State_B5 )
                + randomElements.elementRadom18( Country_B5 ).toString().toUpperCase()).describeConstable();
    }


    public static Optional<String> ByCountry(String Country){

        if(ErroMethods.Method1( Country ) || ErroMethods.Method2( Country ) || ErroMethods.Method3( Country ) || ErroMethods.Method4( Country )){
            return Optional.empty();
        }

        return (randomElements.elementRandom11( Country )
                + randomElements.elementRadom12( Country )
                + randomElements.elementRadom13( Country)
                + randomElements.elementRadom14( Country)).describeConstable();

    }

    public static Optional<String> ByName(String Name_B1){

        if(ErroMethods.Method1( Name_B1 ) || ErroMethods.Method2( Name_B1 ) || ErroMethods.Method3( Name_B1 ) || ErroMethods.Method4( Name_B1 )){
            return Optional.empty();
        }

        return (IDelemntAllowed.AllowedCharacter(Name_B1).toString()
                + randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 )
                + randomElements.element2Con(5, Name_B1).charAt( 0 )
                + randomElements.elementRandom3( Name_B1 ).charAt( 0 )).describeConstable();

    }

    public static Optional<String> ByState(String State_3){


        if(ErroMethods.Method1( State_3 ) || ErroMethods.Method2( State_3 ) || ErroMethods.Method3( State_3 ) || ErroMethods.Method4( State_3 )){
            return Optional.empty();
        }

        return (randomElements.elementRandom8( State_3, 0 )
                + randomElements.elementRandom8( State_3, 1 ).toString()
                + randomElements.elementRandom9( State_3)
                + randomElements.elementRandom10(State_3)).describeConstable();


    }

}