package com.devmarlon2006.IDgeneratorService.service.BuildArea;

import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.IdBy.By;

import java.util.*;

public class Build {

    /*
    PARAMETER_1 -> Pode se uma string
    PARAMETER_2 -> Pode ser uma string
    PARAMETER_3 -> Pode ser uma string
    PARAMETER_4 -> Apenas números
    GenerationMode -> Opção de geração de ID
     */
    public static String idNameBuild(String PARAMETER_1, String PARAMETER_2, String PARAMETER_3, int PARAMETER_4, GenerationPath GenerationMode){

        if (PARAMETER_1 == null || PARAMETER_2 == null || PARAMETER_3 == null || PARAMETER_4 < 0 ){
           return null;
        }

        switch (GenerationMode){

            case PATH_1 -> {
                return Build.Tree(PARAMETER_1,PARAMETER_2,PARAMETER_3);
            }
            case PATH_2 -> {
                return Build.Four(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4);
            }
            case PATH_3 -> {
                return Build.Five(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4);
            }
        }

        return null;
    }


    private static String Tree(String PARAMETER_1, String PARAMETER_2, String PARAMETER_3){

        List <String> ShortID = new ArrayList<>(); //12 characters
        ShortID.add(By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1
        ShortID.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 2
        ShortID.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 3

        return String.join("", ShortID);

    }

    private static String Four(String PARAMETER_1, String PARAMETER_2, String PARAMETER_3, int PARAMETER_4){

        List <String> MediumID = new ArrayList<>(); //16 characters



        MediumID.add(By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1
        MediumID.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 2
        MediumID.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 3
        MediumID.add(By.ByALL(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4).orElse( "" )); // Bloco 4
        MediumID.add(By.ByAge(PARAMETER_4).orElse( "" ));

        return String.join("", MediumID);

    }

    private static String Five(String PARAMETER_1, String PARAMETER_2, String PARAMETER_3, int PARAMETER_4){

        List <String> CompleteID = new ArrayList<>(); //20 characters

        CompleteID.add(By.ByName( PARAMETER_1 ).orElse( "" ) ); // Bloco 1
        CompleteID.add(By.ByAge(PARAMETER_4).orElse( "" )); // Bloco 2
        CompleteID.add(By.ByState( PARAMETER_2 ).orElse( "" )); // Bloco 3
        CompleteID.add(By.ByCountry( PARAMETER_3 ).orElse( "" )); // Bloco 4
        CompleteID.add(By.ByALL(PARAMETER_1,PARAMETER_2,PARAMETER_3,PARAMETER_4).orElse( "" )); // Bloco 5

        return String.join("", CompleteID);
    }
}


