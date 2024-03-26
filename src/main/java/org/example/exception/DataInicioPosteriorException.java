package org.example.exception;

public class DataInicioPosteriorException extends Exception {
    public DataInicioPosteriorException() {
        super("A data de início do filme não pode ser posterior à data de término.");
    }
}

