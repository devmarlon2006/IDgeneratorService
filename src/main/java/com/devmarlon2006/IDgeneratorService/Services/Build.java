package com.devmarlon2006.IDgeneratorService.Services;

import com.devmarlon2006.IDgeneratorService.Services.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.Services.IdBy.By;
import com.devmarlon2006.IDgeneratorService.Services.erroArea.CustomExeption.CustomsExeptions;

import java.util.*;

public class Build {

    /*
    Status: Funcionando
     */

    public static String idNameBuild(String Username, String State, String Country, String Age, GenerationPath GenerationMode){

        if (Username == null || State == null || Country == null || Age == null){
           return null;
        }

        try{

            List <String> idcom = new ArrayList<>();


            idcom.add( By.ByName( Username ).orElse( "" ) ); // Bloco 1

            idcom.add(By.ByAge(Age).orElse( "" )); // Bloco 2

            idcom.add(By.ByState( State ).orElse( "" )); // Bloco 3

            idcom.add(By.ByCountry( Country ).orElse( "" )); // Bloco 4

            idcom.add(By.ByALL(Username,State,Country,Age).orElse( "" )); // Bloco 5

            return String.join("", idcom);

            //CustomsExeptions.validateTableSize( idcom, 5 );

        }catch (IndexOutOfBoundsException | NullPointerException exception){
            return null;
        }
    }
}


