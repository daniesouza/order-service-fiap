package br.com.fiap.order.exceptionhandler;

public class DataIntegrityViolationException extends RuntimeException {

    public DataIntegrityViolationException(String msg){
        super(msg);
    }
}
