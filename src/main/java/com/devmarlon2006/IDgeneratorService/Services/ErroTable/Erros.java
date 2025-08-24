package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

import lombok.Getter;

@Getter
public enum Erros {

    LIST_ERRO(1001, "LIST_ERRO"),
    ID_ERRO(1002, "ERRO_ID"),
    NAME_ERRO(1003, "ERRO_NAME"),
    AGE_ERRO(1004, "ERRO_AGE"),
    COUNTRY_ERRO(1005, "ERRO_COUNTRY"),
    STATE_ERRO(1006, "ERRO_STATE"),
    ALL_ERRO(1007, "USER_ERRO"),
    EMAIL_ERRO(1008, "ERRO_EMAIL"),
    PASSWORD_ERRO(1009, "ERRO_PASSWORD");


    private final int CODIGO;
    private final String MENSAGEM;

    Erros(int CODIGO, String MENSAGEM){
        this.CODIGO = CODIGO;
        this.MENSAGEM = MENSAGEM;
    }

    public String formatErro(int Code, String Message){
        return "ID_ERRO:" + Code + " ERRO_MESSAGE:" + Message;
    }
}
