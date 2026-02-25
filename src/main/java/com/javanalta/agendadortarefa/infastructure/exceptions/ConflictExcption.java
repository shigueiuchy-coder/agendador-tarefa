package com.javanalta.agendadortarefa.infastructure.exceptions;

public class ConflictExcption extends RuntimeException {

    public ConflictExcption(String mensagem){
        super(mensagem);
    }

    public ConflictExcption(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
