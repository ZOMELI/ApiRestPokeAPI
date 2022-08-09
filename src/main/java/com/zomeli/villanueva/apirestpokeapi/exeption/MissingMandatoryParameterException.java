package com.zomeli.villanueva.apirestpokeapi.exeption;

public class MissingMandatoryParameterException extends RuntimeException{

    private static final long serialVersionUID = 874387341803198776L;

    public MissingMandatoryParameterException(String message, Throwable throwable) {
	super(message, throwable);
    }

    public MissingMandatoryParameterException(String message) {
	super(message);
    }

    public MissingMandatoryParameterException() {
	super();
    }

}
