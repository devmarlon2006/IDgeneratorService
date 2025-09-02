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

        if (ErroMethods.NullParameter( Age_B2 )) {
            return Optional.empty();
        }

        if (ErroMethods.AgeLimit(Integer.parseInt(Age_B2))) {
            return Optional.empty();
        }

        try{



            Integer.parseInt( Age_B2 ); //Lançamento de exceção
            int idade = Integer.parseInt( Age_B2 );

            List<String> table = new ArrayList<>();
            ErroMethods.validateTableSize( table, 4 ); //Lançamento de exceção

            table.add( String.valueOf( randomElements.elementRandom4( idade ).charAt( 0 ) ) );
            table.add( String.valueOf( randomElements.elementRandom5( idade ).charAt( 0 ) ) );
            table.add( String.valueOf( randomElements.elementRandom6( idade ).toString().charAt( 0 ) ) );
            table.add( String.valueOf(randomElements.elementRandom7( idade )));

            return String.join("",table).describeConstable();


        }catch (NumberFormatException | IndexOutOfBoundsException exception){
            return Optional.empty(); // If the age is not a number
        }

    }


    public static Optional<String> ByALL(String Username_B5, String State_B5, String Country_B5, String Age_B5){

        if(Username_B5 == null || State_B5 == null || Country_B5 == null || Age_B5 == null){
            return Optional.empty();
        }

        try{
            List <String> table = new ArrayList<>();

            ErroMethods.validateTableSize( table, 4 ); //Lançamento de exceção

            table.add(String.valueOf( randomElements.elementRadom15( Username_B5 ) ) );
            table.add(String.valueOf( randomElements.elementRadom16( Integer.valueOf( Age_B5 ) ) ));
            table.add(String.valueOf( randomElements.elementRadom17( State_B5 ) ) );
            table.add(randomElements.elementRadom18( Country_B5 ).toString().toUpperCase() );

            return String.join("",table).describeConstable();

        }catch (IndexOutOfBoundsException | NullPointerException exception){
            return Optional.empty();
        }
    }


    public static Optional<String> ByCountry( String Country){

        if (ErroMethods.NullParameter( Country )){
            return Optional.empty();
        }

        //Only return true for the call of Optional.empty()
        if(ErroMethods.MethodInvalidSize( Country ) || ErroMethods.InvalidCharacter( Country ) || ErroMethods.InvalidNumberOnName( Country )){
            return Optional.empty();
        }

        try{


            List<String> table = new ArrayList<>();

            ErroMethods.validateTableSize( table, 4 );

            table.add(randomElements.elementRandom11( Country ));
            table.add(randomElements.elementRadom12( Country ));
            table.add( String.valueOf(randomElements.elementRadom13( Country)));
            table.add(String.valueOf( randomElements.elementRadom14( Country ) ));

            return String.join("",table).describeConstable();

        }catch (IndexOutOfBoundsException | NullPointerException exception){
            return Optional.empty();
        }

    }

    public static Optional<String> ByName(String Name_B1){

        if(ErroMethods.NullParameter( Name_B1 )){
            return Optional.empty();
        }

        //Only return true for the call of Optional.empty()
        if(ErroMethods.InvalidCharacter( Name_B1 ) || ErroMethods.InvalidNumberOnName( Name_B1 ) || ErroMethods.MethodInvalidSize( Name_B1 )){
            return Optional.empty();
        }

        try {

            List<String> table = new ArrayList<>();
            ErroMethods.validateTableSize( table, 4 );

            table.add( IDelemntAllowed.AllowedCharacter(Name_B1).toString() );
            table.add( String.valueOf(randomElements.element2Con( 7 ,Name_B1 ).charAt( 0 ) ));
            table.add(String.valueOf( randomElements.element2Con(5, Name_B1).charAt( 0 ) ));
            table.add( String.valueOf(randomElements.elementRandom3( Name_B1 ).charAt( 0 )));

            return String.join("",table).describeConstable();

        }catch (IndexOutOfBoundsException | NullPointerException exception){
            return Optional.empty();
        }



    }

    public static Optional<String> ByState(String State_3){

        if(ErroMethods.NullParameter( State_3 )) {
            return Optional.empty();
        }

        //Only return true for the call of Optional.empty()
        if(ErroMethods.MethodInvalidSize( State_3 ) || ErroMethods.InvalidNumberOnName( State_3 ) || ErroMethods.InvalidCharacter( State_3 )){
            return Optional.empty();
        }

        try{

            List<String> table = new ArrayList<>();
            ErroMethods.validateTableSize( table, 4 );

            table.add(String.valueOf(randomElements.elementRandom8( State_3, 0 )));
            table.add(String.valueOf(randomElements.elementRandom8( State_3, 1 )));
            table.add(randomElements.elementRandom9( State_3 ));
            table.add(String.valueOf(randomElements.elementRandom10( State_3 )));

            return String.join("",table).describeConstable();

        }catch (IndexOutOfBoundsException | NullPointerException exception){
            return Optional.empty();
        }
    }
}