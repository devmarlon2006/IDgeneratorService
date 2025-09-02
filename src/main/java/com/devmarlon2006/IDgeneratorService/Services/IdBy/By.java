package com.devmarlon2006.IDgeneratorService.Services.IdBy;

import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.IDelemntAllowed;
import com.devmarlon2006.IDgeneratorService.Services.ElementsLogic.randomElements;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.ErroMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class By {

    private By(){} // Private constructor to avoid instantiation

    public static Optional <String> ByAge(String Age_B2){

        if (ErroMethods.Method6( Age_B2 )){
            return Optional.empty();// If the age is null
        }

        List<String> table = new ArrayList<>();

        try{

            Integer.parseInt( Age_B2 );

            table.add( String.valueOf( randomElements.elementRandom4( Integer.parseInt( Age_B2 ) ).charAt( 0 ) ) );
            table.add( String.valueOf( randomElements.elementRandom5( Integer.parseInt( Age_B2 ) ).charAt( 0 ) ) );
            table.add( String.valueOf( randomElements.elementRandom6( Integer.parseInt( Age_B2 ) ).toString().charAt( 0 ) ) );
            table.add( String.valueOf(randomElements.elementRandom7( Integer.parseInt( Age_B2 ) )));


        }catch (NumberFormatException exception){
            return Optional.empty(); // If the age is not a number
        }

        return String.join("",table).describeConstable();

    }


    public static Optional<String> ByALL(String Username_B5, String State_B5, String Country_B5, String Age_B5){

        List <String> table = new ArrayList<>();

        try{
            if (ErroMethods.Method6( Username_B5 ) || ErroMethods.Method6( State_B5 ) || ErroMethods.Method6( Country_B5 ) || ErroMethods.Method6( Age_B5 )){
                return Optional.empty();
            }

            table.add(String.valueOf( randomElements.elementRadom15( Username_B5 ) ) );
            table.add(String.valueOf( randomElements.elementRadom16( Integer.valueOf( Age_B5 ) ) ));
            table.add(String.valueOf( randomElements.elementRadom17( State_B5 ) ) );
            table.add(randomElements.elementRadom18( Country_B5 ).toString().toUpperCase() );

        }catch (NullPointerException exception){
            return Optional.empty();
        }

        return String.join("",table).describeConstable();
    }


    public static Optional<String> ByCountry( String Country){

        if (ErroMethods.Method6( Country )){
            return Optional.empty();
        }

        List<String> table = new ArrayList<>();


        try{
            if(ErroMethods.Method1( Country ) || ErroMethods.Method2( Country ) || ErroMethods.Method3( Country ) || ErroMethods.Method4( Country )){
                return Optional.empty();
            }
            table.add(randomElements.elementRandom11( Country ));
            table.add(randomElements.elementRadom12( Country ));
            table.add( String.valueOf(randomElements.elementRadom13( Country)));
            table.add(String.valueOf( randomElements.elementRadom14( Country ) ));

        }catch (NullPointerException exception){
            return Optional.empty();
        }

        return String.join("",table).describeConstable();

    }

    public static Optional<String> ByName(String Name_B1){

        List<String> table = new ArrayList<>();




        try {

            if(ErroMethods.Method1( Name_B1 ) || ErroMethods.Method2( Name_B1 ) || ErroMethods.Method3( Name_B1 ) || ErroMethods.Method4( Name_B1 )){
                return Optional.empty();
            }

            table.add( IDelemntAllowed.AllowedCharacter(Name_B1).toString() );
            table.add( String.valueOf(randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 ) ));
            table.add(String.valueOf( randomElements.element2Con(5, Name_B1).charAt( 0 ) ));
            table.add( String.valueOf(randomElements.elementRandom3( Name_B1 ).charAt( 0 )));

        }catch (NullPointerException exception){
            return Optional.empty();
        }

        return String.join("",table).describeConstable();

    }

    public static Optional<String> ByState(String State_3){

        List<String> table = new ArrayList<>();

        try{
            if(ErroMethods.Method1( State_3 ) || ErroMethods.Method2( State_3 ) || ErroMethods.Method3( State_3 ) || ErroMethods.Method4( State_3 )){
                return Optional.empty();
            }

            table.add(String.valueOf(randomElements.elementRandom8( State_3, 0 )));
            table.add(String.valueOf(randomElements.elementRandom8( State_3, 1 )));
            table.add(randomElements.elementRandom9( State_3 ));
            table.add(String.valueOf(randomElements.elementRandom10( State_3 )));

        }catch (NullPointerException exception){
            return Optional.empty();
        }



        return String.join("",table).describeConstable();


    }

}