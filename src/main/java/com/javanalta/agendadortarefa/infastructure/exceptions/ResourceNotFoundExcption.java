package com.javanalta.agendadortarefa.infastructure.exceptions;


public class ResourceNotFoundExcption  extends RuntimeException{

    public ResourceNotFoundExcption(String mensagem){
        super(mensagem);
    }

    public ResourceNotFoundExcption(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
