package com.devmarlon2006.IDgeneratorService.Services;

import com.devmarlon2006.IDgeneratorService.Services.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.Services.IdBy.By;

import java.util.*;

public class Build {

    /*
    PARAMETER_1 -> Pode se uma string
    PARAMETER_2 -> Pode ser uma string
    PARAMETER_3 -> Pode ser uma string
    PARAMETER_4 -> Pode ser uma string, mas tem que ser uma string com apenas números
    GenerationMode -> Opção de geração de ID
     */

    public static String idNameBuild(String PARAMETER_1, String PARAMETER_2, String PARAMETER_3, int PARAMETER_4, GenerationPath GenerationMode){

        if (PARAMETER_1 == null || PARAMETER_2 == null || PARAMETER_3 == null || PARAMETER_4 < 0 ){
           return null;
        }

        switch (GenerationMode){

            case PATH_1 -> { //Cliente

                try{

                    List <String> ClientIDcom  = new ArrayList<>();

                    ClientIDcom.add( By.ByName( PARAMETER_1 ).orElse( "" ) ); // String

                    ClientIDcom.add(By.ByAge(PARAMETER_4).orElse( "" )); // String com apenas números

                    ClientIDcom.add(By.ByState( PARAMETER_2 ).orElse( "" )); // String

                    ClientIDcom.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // String

                    ClientIDcom.add(By.ByALL(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4).orElse( "" )); // Bloco 5

                    return String.join("", ClientIDcom);

                }catch (IndexOutOfBoundsException | NullPointerException exception){
                    return null;
                }
            }

            case PATH_2 -> { //Barbeiro

                try{

                    List <String> BarberIDcom = new ArrayList<>();

                    BarberIDcom.add( By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1

                    BarberIDcom.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 2

                    BarberIDcom.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 3

                    BarberIDcom.add(By.ByALL(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4).orElse( "" )); // Bloco 4

                    BarberIDcom.add(By.ByAge(PARAMETER_4).orElse( "" ));

                    return String.join("", BarberIDcom);

                }catch (NullPointerException exception){
                    return null;
                }
            }

            case PATH_3 -> { //Corte de cabelo, um id mais curto

               try{
                   List <String> HaircutIDcom = new ArrayList<>();

                   HaircutIDcom.add( By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1

                   HaircutIDcom.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 2

                   HaircutIDcom.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 3

                   return String.join("", HaircutIDcom);
               }catch (NullPointerException exception){
                   return null;
               }

            }

            case PATH_4 -> { //Barbearia

                try{

                    List <String> BarberShopIDcom = new ArrayList<>();

                    BarberShopIDcom.add( By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1

                    BarberShopIDcom.add(By.ByAge(PARAMETER_4).orElse( "" )); // Bloco 2

                    BarberShopIDcom.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 3

                    BarberShopIDcom.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 4

                    BarberShopIDcom.add(By.ByALL(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4).orElse( "" )); // Bloco 5

                    return String.join("", BarberShopIDcom);

                }catch (NullPointerException exception){
                    return null;
                }
            }
        }
        return null;
    }
}


