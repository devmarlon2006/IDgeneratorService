package com.devmarlon2006.IDgeneratorService.service.erroArea.erroModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiErroResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;


    @JsonInclude
    private List<ErrorDetail> errors;
}


