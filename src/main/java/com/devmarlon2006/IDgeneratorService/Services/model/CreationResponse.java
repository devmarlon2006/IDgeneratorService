package com.devmarlon2006.IDgeneratorService.Services.model;

import lombok.Getter;

@Getter
public class CreationResponse {
    private String id;

    public CreationResponse(String id) {
        this.id = id;
    }

}