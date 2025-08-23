package com.devmarlon2006.IDgeneratorService.Services;

import com.devmarlon2006.IDgeneratorService.Services.IdBy.*;

import java.util.*;

public class Build {

    /*
    Status: Funcionando
     */

    public static String idNameBuild(String Username, String State, String Country, int Age){

        if (Username == null){
           return "LIST_ERRO_NULL_VALUE";
        }

        List <String> idcom = new ArrayList<>();

        idcom.add( IdByName.ByName( Username ).orElse( "" ) ); // Bloco 1

        idcom.add(IdByAge.ByAge(Age).orElse( "" )); // Bloco 2

        idcom.add(IdByState.ByState( State ).orElse( "" )); // Bloco 3

        idcom.add(IdByCountry.ByCountry( Country ).orElse( "" )); // Bloco 4

        idcom.add( IdByALL.ByALL(Username,State,Country,Age).orElse( "" )); // Bloco 5

        for (int i = 0; i < idcom.size(); i++) {

            String[] list = {"Username", "Age", "State", "Country", "All"};

            if (idcom.get( i ).contains( "ID_ERRO" )) {
                idcom.clear();
                idcom.add( "LIST_ERRO_INCORRECT_VALUE("+ list[i] + ")" );
                return String.join( "", idcom );
            }

        }

        return String.join("", idcom);
    }
}


