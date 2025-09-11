package com.devmarlon2006.IDgeneratorService.controller;

import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.Intermediary.ControllerForService;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.Bytes;
import com.devmarlon2006.IDgeneratorService.service.model.Response.CreationResponse;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Post")
public class CreationController{

    @PostMapping("/Create/id/Path3")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Bytes IDBytes){

        System.out.println(IDBytes.getBYTE_1());
        System.out.println(IDBytes.getBYTE_2());
        System.out.println(IDBytes.getBYTE_3());
        System.out.println(IDBytes.getBYTE_4());

        ControllerForService<Bytes> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation(IDBytes, GenerationPath.PATH_3);

        }catch (NullPointerException exception) {
            return new CreationResponse<>( null );
        }

        return new CreationResponse<>( GENERATED_ID );
    }

    @PostMapping("/Create/id/Path2")
    public CreationResponse<String>  ControllerIDCreationBarber(@RequestBody @Valid Bytes bytes){

         ControllerForService<Bytes> controllerForService = new ControllerForService<>();
         final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation(bytes, GenerationPath.PATH_2);


        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(GENERATED_ID);
    }

    @PostMapping("/Create/id/Path1")
    public CreationResponse<String> ControllerIDCreationHairCut(@RequestBody @Valid Bytes bytes){

        ControllerForService<Bytes> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation(bytes, GenerationPath.PATH_1);

        }catch (NullPointerException exception){
            return new CreationResponse<>(null);
        }

        return new CreationResponse<>(GENERATED_ID);
    }

}
