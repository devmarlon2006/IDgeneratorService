package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.model.User.InfoClassElements;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/create")
public class CreationController{

    @PostMapping("/CreateUserID")
    public InfoClassElements controllerIDCreation(@RequestBody InfoClassElements User){

        User.setID( Build.idNameBuild(User.getName(), User.getStateBornCountry(), User.getBornCountry(), User.getAge()) );

        //Apenas para testes!!
        if(User.isIDNotNull()){
            System.out.println("Crated ✓");
        }else{
            System.out.println("Erro");
        }

        System.out.println("Username:" + User.getName() + " ID_created:" + User.getID() + "\n");
        //Teste Î

        return User;

    }

}
