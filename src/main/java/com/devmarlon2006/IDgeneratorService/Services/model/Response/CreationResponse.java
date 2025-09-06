package com.devmarlon2006.IDgeneratorService.Services.model.Response;

import lombok.Getter;

/*
Essa classe e usada como corpo da resposta
enviada para o serviço que a requisitou.
 */

@Getter
public class CreationResponse<T> {

    private final T id;

    public CreationResponse(T id) {
        this.id = id;
    }

}