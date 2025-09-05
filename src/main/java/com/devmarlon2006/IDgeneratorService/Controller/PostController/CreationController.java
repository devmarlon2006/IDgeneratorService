package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.model.User.User;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class CreationController{

    @PostMapping("/Post/CreateUserID")
    public String controllerIDCreation(@RequestBody @Valid  User User) {
        User.setID( Build.idNameBuild( User.getName(), User.getStateBornCountry(), User.getBornCountry(), User.getAge() ) );
        return User.getID();
    }

}
