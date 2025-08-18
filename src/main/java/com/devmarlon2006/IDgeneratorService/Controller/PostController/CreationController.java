package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.model.User.InfoClassElements;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/create")
public class CreationController{


    @PostMapping("/CreateUserID")
    public InfoClassElements controllerIDCreation(@RequestBody InfoClassElements User){
        User.setID( Build.idNameBild(User.getName(), User.getStateBornCountry(), User.getBornCountry(), User.getAge()));
        return User;
    }

}
