package com.devmarlon2006.IDgeneratorService.Services;

import com.devmarlon2006.IDgeneratorService.Services.IdBy.*;

import java.util.*;

public class Build {

    public static String idNameBild(String Username, String State, String Country, int Age){


        if (Username == null){
            return null;
        }else {

            List <String> idcom = new ArrayList<>();

            idcom.add( IdByName.ByName( Username ).orElse( "" ) ); // Bloco 1

            idcom.add(IdByAge.ByAge(Age).orElse( "" )); // Bloco 2

            idcom.add(IdByState.ByState( State ).orElse( "" )); // Bloco 3

            idcom.add(IdByCountry.ByCountry( Country ).orElse( "" )); // Bloco 4

            idcom.add( IdByALL.ByALL(Username,State,Country,Age).orElse( "" )); // Bloco 5


            return String.join("", idcom);

        }




    }


}


