package com.devmarlon2006.IDgeneratorService.Controller.PostController;


import com.devmarlon2006.IDgeneratorService.Services.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class DeleteControler {

    private final UserService userService;
    @Autowired
    public DeleteControler(UserService userService) {
        this.userService = userService;
    }
    @DeleteMapping("/Delete/{ID}")
    public ResponseEntity<?> deleteUser (@PathVariable("ID") @Valid String ID){
        userService.deletarUser( ID );
        return ResponseEntity.status( HttpStatus.OK ).body( "Usuário deletado com sucesso!" );
    }

}
