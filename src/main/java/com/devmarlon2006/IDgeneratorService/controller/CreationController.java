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

    private final ControllerForService<Bytes> controllerForService;

    public CreationController(ControllerForService<Bytes> controllerForService) {
        this.controllerForService = controllerForService;
    }

    @PostMapping("/Create/id/{path}")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Bytes IDBytes, @PathVariable("path") GenerationPath path){

        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation(IDBytes, path);

        }catch (NullPointerException exception) {
            return new CreationResponse<>( null );
        }

        return new CreationResponse<>( GENERATED_ID );
    }
}