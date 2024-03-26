package org.example.exception;

public class DataInvalidaException extends Exception {
    public DataInvalidaException(String s) {
        super("A data de início do filme não pode ser posterior à data de término.");
    }
}

