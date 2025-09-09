package com.devmarlon2006.IDgeneratorService.service.erroArea.erroModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail{

    private String code;
    private String field;
    private String message;
}
