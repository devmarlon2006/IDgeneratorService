package com.devmarlon2006.IDgeneratorService.controller;

import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.Intermediary.ControllerForService;
import com.devmarlon2006.IDgeneratorService.service.model.Response.CreationResponse;

import jakarta.validation.Valid;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Post")
public class CreationController{

    private final ControllerForService<Object> controllerForService;

    public CreationController(ControllerForService<Object> controllerForService) {
        this.controllerForService = controllerForService;
    }

    @NonNull
    @PostMapping("/Create/id/{path}")
    public CreationResponse<String> ControllerIDCreationClient(@RequestBody @Valid Object IDBytes, @PathVariable("path") GenerationPath path){

        final String GENERATED_ID;

        try{

            GENERATED_ID = controllerForService.Generation( IDBytes, path);

        }catch (NullPointerException exception) {
            return new CreationResponse<>( null );
        }

        return new CreationResponse<>( GENERATED_ID );
    }
}