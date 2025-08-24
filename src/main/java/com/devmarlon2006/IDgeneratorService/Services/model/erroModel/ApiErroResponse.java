package com.devmarlon2006.IDgeneratorService.Services.model.erroModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiErroResponse {
    private int status;
    private String error;
    private String message;
    private LocalDateTime TimeStamp;
}


