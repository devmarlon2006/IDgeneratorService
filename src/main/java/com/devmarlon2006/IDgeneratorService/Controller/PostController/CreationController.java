package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.BarbeShop;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.Barber;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.HairCut;
import com.devmarlon2006.IDgeneratorService.Services.model.Response.CreationResponse;
import com.devmarlon2006.IDgeneratorService.Services.model.POJO.Client;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/Post")
public class CreationController{

    @PostMapping("/Create/id/Client")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Client client) {

        client.setID( Build.idNameBuild( client.getName(),
                client.getStateBornCountry(), client.getBornCountry(),
                client.getAge(), GenerationPath.PATH_1));

        return new CreationResponse<>( client.getId() );
    }

    @PostMapping("/Create/id/Barber")
    public CreationResponse<String>  ControllerIDCreationBarber(@RequestBody Barber barber){
        barber.setID("00000000000000000000");
        return new CreationResponse<>(barber.getId());
    }

    @PostMapping("/Create/id/HairCut")
    public CreationResponse<String> ControllerIDCreationHairCut(@RequestBody HairCut hairCut){
        hairCut.setID("00000000000000000000");
        return new CreationResponse<>(hairCut.getId());
    }
    @PostMapping("/Create/id/BarbeShop")
    public CreationResponse<String> ControllerIDCreation(BarbeShop barbeShop){
        barbeShop.setID("00000000000000000000");
        return new CreationResponse<>(barbeShop.getId());
    }

}
