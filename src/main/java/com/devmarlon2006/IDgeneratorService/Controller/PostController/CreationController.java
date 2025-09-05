package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.model.CreationResponse;
import com.devmarlon2006.IDgeneratorService.Services.model.User.User;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class CreationController{

    @PostMapping("/Post/CreateUserID")
    public CreationResponse controllerIDCreation(@RequestBody @Valid  User user) {

        user.setID( Build.idNameBuild( user.getName(), user.getStateBornCountry(), user.getBornCountry(), user.getAge() ) );

        System.out.println(user.getID());

        return new CreationResponse(user.getID());

    }

}
