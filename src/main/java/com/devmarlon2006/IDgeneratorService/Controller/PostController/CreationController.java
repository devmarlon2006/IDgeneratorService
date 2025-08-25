package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Data.UserRepository;
import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.model.User.User;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create")
public class CreationController{

    private final UserRepository UserRepository;

    @Autowired
    public CreationController(UserRepository userRepository) {
        UserRepository = userRepository;
    }

    @PostMapping("/CreateUserID")
    public ResponseEntity<?> controllerIDCreation(@Valid @RequestBody User user){

        user.setID( Build.idNameBuild(user.getName(), user.getStateBornCountry(), user.getBornCountry(), user.getAge()) );
        UserRepository.save(user);

        return ResponseEntity.status( HttpStatus.CREATED).body("Usuário criado com sucesso!");

    }

}
