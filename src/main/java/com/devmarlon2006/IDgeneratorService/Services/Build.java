package com.devmarlon2006.IDgeneratorService.Services;

import com.devmarlon2006.IDgeneratorService.Services.IdBy.By;

import java.util.*;

public class Build {

    /*
    Status: Funcionando
     */

    public static String idNameBuild(String Username, String State, String Country, String Age){

        if (Username == null || State == null || Country == null || Age == null){
           return null;
        }

        List <String> idcom = new ArrayList<>();


        try{

            idcom.add( By.ByName( Username ).orElse( "" ) ); // Bloco 1

            idcom.add(By.ByAge(Age).orElse( "" )); // Bloco 2

            idcom.add(By.ByState( State ).orElse( "" )); // Bloco 3

            idcom.add(By.ByCountry( Country ).orElse( "" )); // Bloco 4

            idcom.add(By.ByALL(Username,State,Country,Age).orElse( "" )); // Bloco 5

        }catch (IndexOutOfBoundsException exception){
            return null;
        }



        for (int i = 0; i < idcom.size(); i++) {

            String[] list = {"Username", "Age", "State", "Country"};

            if (idcom.get( i ).isEmpty()){
                idcom.clear();
                idcom.add( "LIST_ERRO_INCORRECT_VALUE("+ list[i] + ")" );
                return String.join( "", idcom );
            }

        }

        return String.join("", idcom);
    }
}


