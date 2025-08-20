package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

public enum Erros {

    LIST_ERRO(1001, "Erro ao listar os dados"),
    ID_ERRO(1002, "Erro ao gerar o ID"),
    NAME_ERRO(1003, "Nome Invalido"),
    AGE_ERRO(1004, "Idade Invalida"),
    COUNTRY_ERRO(1005, "Pais Invalido"),
    STATE_ERRO(1006, "Estado Invalido"),

    ALL_ERRO(1007, "Erro Em Todas as informações")
    ;

    private int CODIGO;
    private String MENSAGEM;

    Erros(int CODIGO, String MENSAGEM){
        this.CODIGO = CODIGO;
        this.MENSAGEM = MENSAGEM;
    }

    public int getCODIGO(){
        return this.CODIGO;
    }

    public String getMENSAGEM(){
        return this.MENSAGEM;
    }
}
