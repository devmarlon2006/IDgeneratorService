package com.devmarlon2006.IDgeneratorService.Controller.PostController;


import com.devmarlon2006.IDgeneratorService.Services.ErroTable.Erros;
import com.devmarlon2006.IDgeneratorService.Services.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.lookup.DataSourceLookupFailureException;
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

        if (ID == null){
            return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( "ID incompleto" );
        }

        if (userService.getUserByID( ID ) == null ){
            return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( Erros.NOT_FOUND );
        }

        try{

            userService.deletarUser( ID );

        }catch (DataSourceLookupFailureException exception){
            return ResponseEntity.status( HttpStatus.INTERNAL_SERVER_ERROR ).body( Erros.INTERNAL_SERVER_ERROR );
        }




        return ResponseEntity.status( HttpStatus.OK ).body( "Usuário deletado com sucesso!" );
    }

}
