package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.GlobalExceptionHandler;
import com.devmarlon2006.IDgeneratorService.Services.model.User.InfoClassElements;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/create")
public class CreationController{

    @PostMapping("/CreateUserID")
    public ResponseEntity<?> controllerIDCreation(@Valid @RequestBody InfoClassElements User){

        User.setID( Build.idNameBuild(User.getName(), User.getStateBornCountry(), User.getBornCountry(), User.getAge()) );

        return ResponseEntity.status( HttpStatus.CREATED).body("Recurso criado com sucesso!");

    }

}
