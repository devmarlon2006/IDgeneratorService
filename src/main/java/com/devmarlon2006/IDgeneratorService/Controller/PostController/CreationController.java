package com.devmarlon2006.IDgeneratorService.Controller.PostController;

import com.devmarlon2006.IDgeneratorService.Services.Build;
import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.devmarlon2006.IDgeneratorService.Services.Service.UserService;
import com.devmarlon2006.IDgeneratorService.Services.model.User.User;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class CreationController{

    private final UserService userService;

    @Autowired
    public CreationController( UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/Post/CreateUserID")
    public ResponseEntity<?> controllerIDCreation(@RequestBody @Valid  User User) {

        if (User == null){
            return ResponseEntity.status( HttpStatus.BAD_REQUEST).body( "Usuário incompleto" );
        }

        if (User.getName() == null || User.getStateBornCountry() == null || User.getBornCountry() == null || User.getAge() == null){
            return ResponseEntity.status( HttpStatus.BAD_REQUEST).body( Erros.USER_ERRO);
        }


        try{

            User.setID( Build.idNameBuild( User.getName(), User.getStateBornCountry(), User.getBornCountry(), User.getAge() ) );
            System.out.println( User.getID() );

        }catch (ClassCastException | NullPointerException exception){

            return ResponseEntity.status( HttpStatus.BAD_REQUEST).body( Erros.INTERNAL_SERVER_ERROR);

        }

        try{

            userService.saveUser( User );

        }catch(SecurityException exception){

            return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( Erros.SAVE_DATA_ERRO );

        }




        return ResponseEntity.status( HttpStatus.CREATED ).body( "Usuário criado com sucesso!" );

    }

}
