package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.BarbeShop;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.Barber;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.HairCut;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.Client;
import com.devmarlon2006.IDgeneratorService.Services.model.Response.CreationResponse;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/Post")
public class CreationController{

    @PostMapping("/Create/id/Client")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Client client) {
        try{

            client.setID( Build.idNameBuild( client.getName(), client.getStateBornCountry(),
                    client.getBornCountry(), client.getAge(), GenerationPath.PATH_1));

        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>( client.getId() );
    }

    @PostMapping("/Create/id/Barber")
    public CreationResponse<String>  ControllerIDCreationBarber(@RequestBody @Valid Barber barber){
        try{

            barber.setID(Build.idNameBuild( barber.getName(), barber.getState(), barber.getCountry(),
                    barber.getAge(), GenerationPath.PATH_2 ));

        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }


        return new CreationResponse<>(barber.getId());
    }

    @PostMapping("/Create/id/HairCut")
    public CreationResponse<String> ControllerIDCreationHairCut(@RequestBody @Valid HairCut hairCut){
        try{

            hairCut.setID( Build.idNameBuild( hairCut.getName(),"null","null",hairCut.getAleatoryNumber(), GenerationPath.PATH_3 ) );

        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(hairCut.getId());
    }
    @PostMapping("/Create/id/BarbeShop")
    public CreationResponse<String> ControllerIDCreationBarberShop(@RequestBody @Valid BarbeShop barbeShop){

        try {

            Random random = new Random();

            barbeShop.setID(Build.idNameBuild( barbeShop.getName(),barbeShop.getState(),barbeShop.getCountry(),
                    random.nextInt(),GenerationPath.PATH_4 ));

        } catch (NullPointerException exeption) {
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(barbeShop.getId());
    }

}
