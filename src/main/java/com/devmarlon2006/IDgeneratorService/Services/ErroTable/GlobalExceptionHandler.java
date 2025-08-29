package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

import com.devmarlon2006.IDgeneratorService.Services.model.erroModel.ApiErroResponse;
import com.devmarlon2006.IDgeneratorService.Services.model.erroModel.ErrorDetail;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErroResponse> handleValidationExceptions(MethodArgumentNotValidException ex, WebRequest request) {

        List<ErrorDetail> errorDetails = new ArrayList<>();

        ex.getBindingResult().getAllErrors().forEach( error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            assert errorMessage != null;
            String errorCode = mapErrorMessageToCode( errorMessage );

            errorDetails.add(new ErrorDetail(errorCode, fieldName, errorMessage));
        });


        ApiErroResponse apiError = new ApiErroResponse();
        apiError.setTimestamp( LocalDateTime.now());
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());
        apiError.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
        apiError.setMessage("A requisição contém erros de validação.");
        apiError.setPath(request.getDescription(false).replace("uri=", ""));
        apiError.setErrors(errorDetails);

        return new ResponseEntity<>( apiError, HttpStatus.BAD_REQUEST );
    }


    private String mapErrorMessageToCode(String errorMessage) {

        if (errorMessage.contains("Username")) {
            return Erros.NAME_ERRO.name();
        }

        if (errorMessage.contains( "Age" )) {
            return Erros.AGE_ERRO.name();
        }

        if (errorMessage.contains( "State" )) {
            return Erros.STATE_ERRO.name();
        }

        if (errorMessage.contains( "Country" )) {
            return Erros.COUNTRY_ERRO.name();
        }

        if (errorMessage.contains( "E-mail" )) {
            return Erros.EMAIL_ERRO.name();
        }

        if (errorMessage.contains( "All" )) {
            return Erros.ALL_ERRO.name();
        }

        if (errorMessage.contains( "Password" )) {
            return Erros.PASSWORD_ERRO.name();
        }
        return "0"; // Código de erro genérico

    }
}