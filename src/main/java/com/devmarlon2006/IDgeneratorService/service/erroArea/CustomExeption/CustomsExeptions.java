package com.devmarlon2006.IDgeneratorService.service.erroArea.CustomExeption;

import java.util.List;

public class CustomsExeptions extends RuntimeException {
    public CustomsExeptions(String message) {
        super( message );
    }

    public static void validateTableSize(List<?> table, int expectedSize) {
        if (table.size() < expectedSize) {
            throw new IndexOutOfBoundsException( "A lista deve ter pelo menos " + expectedSize + " elementos." );
        }
    }
}
