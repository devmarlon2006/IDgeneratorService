package com.devmarlon2006.IDgeneratorService.Services.ErroTable;

public class ErroExepition extends RuntimeException{

    private Erros erro;

    public ErroExepition(Erros erro){
        super(erro.getMENSAGEM());
    }

    public Erros getERRO(){
        return erro;
    }
}
