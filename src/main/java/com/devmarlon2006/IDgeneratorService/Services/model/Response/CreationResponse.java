package com.devmarlon2006.IDgeneratorService.Services.model.Response;

import lombok.Getter;

@Getter
public class CreationResponse {
    private final String id;

    public CreationResponse(String id) {
        this.id = id;
    }

}