package com.zomeli.villanueva.apirestpokeapi.exeption;


import com.zomeli.villanueva.apirestpokeapi.model.ExceptionType;
import com.zomeli.villanueva.apirestpokeapi.utils.ErrorConstant;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.text.MessageFormat;
import java.util.*;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers,
	    HttpStatus status, WebRequest request) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_501_EXCEPTIONID);
	error.setExceptionText(ErrorConstant.STATUS_501_EXCEPTIONTEXT);
	error.setMoreInfo(ErrorConstant.STATUS_501_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_501_USERMESSAGE);

	Set<HttpMethod> supportedMethods = ex.getSupportedHttpMethods();
	if (!CollectionUtils.isEmpty(supportedMethods)) {
	    headers.setAllow(supportedMethods);
	}
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, headers, HttpStatus.BAD_REQUEST);

    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status,
	    WebRequest request) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_404_EXCEPTIONID);
	error.setExceptionText(MessageFormat.format(ErrorConstant.STATUS_404_EXCEPTIONTEXT, ex.getVariableName()));
	error.setMoreInfo(ErrorConstant.STATUS_404_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_404_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, headers, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers,
	    HttpStatus status, WebRequest request) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_404_EXCEPTIONID);
	error.setExceptionText(MessageFormat.format(ErrorConstant.STATUS_404_EXCEPTIONTEXT, ex.getParameterName()));
	error.setMoreInfo(ErrorConstant.STATUS_404_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_404_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, headers, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_500_EXCEPTIONID);
	error.setExceptionText(MessageFormat.format(ErrorConstant.STATUS_500_EXCEPTIONTEXT, ""));
	error.setMoreInfo(ErrorConstant.STATUS_500_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_500_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
	    HttpStatus status, WebRequest request) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_400_EXCEPTIONID);
	error.setExceptionText(MessageFormat.format(ErrorConstant.STATUS_400_EXCEPTIONTEXT, ex.getParameter()));
	error.setMoreInfo(ErrorConstant.STATUS_400_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_400_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(MissingMandatoryParameterException.class)
    public final ResponseEntity<Object> handleMissingMandatoryParameterException(Exception ex) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_404_EXCEPTIONID);
	error.setExceptionText(ErrorConstant.STATUS_404_EXCEPTIONTEXT);
	error.setMoreInfo(ErrorConstant.STATUS_404_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_404_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidParameterException.class)
    public final ResponseEntity<Object> handleInvalidParameterException(Exception ex) {
	ExceptionType error = new ExceptionType();
	error.setExceptionId(ErrorConstant.STATUS_400_EXCEPTIONID);
	error.setExceptionText(MessageFormat.format(ErrorConstant.STATUS_400_EXCEPTIONTEXT,ex.getMessage()));
	error.setMoreInfo(ErrorConstant.STATUS_400_MOREINFO);
	error.setUserMessage(ErrorConstant.STATUS_400_USERMESSAGE);
	LOGGER.error(ExceptionUtils.getStackTrace(ex));
	LOGGER.error("Message: " + error);
	return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
