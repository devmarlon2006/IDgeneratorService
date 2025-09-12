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

        ControllerForService<Bytes> controllerForService = new ControllerForService<>();
        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation(IDBytes, GenerationPath.PATH_2);

        }catch (NullPointerException exception) {
            return new CreationResponse<>( null );
        }

        return new CreationResponse<>( GENERATED_ID );
    }
}
