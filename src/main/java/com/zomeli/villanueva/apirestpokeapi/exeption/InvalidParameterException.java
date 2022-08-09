package com.zomeli.villanueva.apirestpokeapi.exeption;

public class InvalidParameterException extends RuntimeException{

    private static final long serialVersionUID = 874387341803198776L;

    public InvalidParameterException(String message, Throwable throwable) {
	super(message, throwable);
    }

    public InvalidParameterException(String message) {
	super(message);
    }

    public InvalidParameterException() {
	super();
    }
}
