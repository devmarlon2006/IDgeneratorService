package com.devmarlon2006.IDgeneratorService.controller;

import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.Intermediary.ControllerForService;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.BarberShopArea.BarbeShop;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.BarberArea.Barber;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.HairCutArea.HairCut;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.ClientArea.Client;
import com.devmarlon2006.IDgeneratorService.service.model.Response.CreationResponse;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Post")
public class CreationController{

    @PostMapping("/Create/id/Client")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Client client){

        ControllerForService<Client> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.generateID(client, GenerationPath.PATH_3);

        }catch (NullPointerException exception) {
            return new CreationResponse<>( null );
        }
        return new CreationResponse<>( GENERATED_ID );
    }

    @PostMapping("/Create/id/Barber")
    public CreationResponse<String>  ControllerIDCreationBarber(@RequestBody @Valid Barber barber){

         ControllerForService<Barber> controllerForService = new ControllerForService<>();
          final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.generateID(barber, GenerationPath.PATH_2);


        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(GENERATED_ID);
    }

    @PostMapping("/Create/id/HairCut")
    public CreationResponse<String> ControllerIDCreationHairCut(@RequestBody @Valid HairCut hairCut){

        ControllerForService<HairCut> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;

        try{
            GENERATED_ID = controllerForService.generateID(hairCut, GenerationPath.PATH_1);

        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(GENERATED_ID);
    }

    @PostMapping("/Create/id/BarbeShop")
    public CreationResponse<String> ControllerIDCreationBarberShop(@RequestBody @Valid BarbeShop barbeShop){

        ControllerForService<BarbeShop> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;


        try {

            GENERATED_ID = controllerForService.generateID(barbeShop, GenerationPath.PATH_3);

        } catch (NullPointerException exeption) {
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(GENERATED_ID);
    }

}
