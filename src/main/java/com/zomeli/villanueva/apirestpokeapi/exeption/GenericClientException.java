package com.zomeli.villanueva.apirestpokeapi.exeption;

public class GenericClientException extends RuntimeException {

    private static final long serialVersionUID = 874387341803198776L;

    public GenericClientException(String message, Throwable throwable) {
	super(message, throwable);
    }

    public GenericClientException(String message) {
	super(message);
    }

    public GenericClientException() {
	super();
    }

}
