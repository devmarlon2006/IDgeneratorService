package com.devmarlon2006.IDgeneratorService.service.model.Response;

/*
Essa classe e usada como corpo da resposta
enviada para o serviço que a requisitou.
 */

public record CreationResponse<T>(T id) {
}