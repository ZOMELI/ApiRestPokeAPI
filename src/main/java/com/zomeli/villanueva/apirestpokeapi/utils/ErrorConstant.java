package com.zomeli.villanueva.apirestpokeapi.utils;

public class ErrorConstant {

    public static final int    STATUS_500_EXCEPTIONID   = 400;
    public static final String STATUS_500_EXCEPTIONTEXT = "Generic Server Error: {0}";
    public static final String STATUS_500_MOREINFO      = "There was a problem in the Service Providers network that prevented to carry out the request";
    public static final String STATUS_500_USERMESSAGE   = "BAD_REQUEST";

    public static final int    STATUS_404_EXCEPTIONID   = 400;
    public static final String STATUS_404_EXCEPTIONTEXT = "Missing mandatory parameter";
    public static final String STATUS_404_MOREINFO      = "API Request without mandatory field";
    public static final String STATUS_404_USERMESSAGE   = "BAD_REQUEST";

    public static final int    STATUS_400_EXCEPTIONID   = 400;
    public static final String STATUS_400_EXCEPTIONTEXT = "Invalid parameter: {0}";
    public static final String STATUS_400_MOREINFO      = "API Request with an element not conforming to Swagger definitions or to a list of allowed Query Parameters";
    public static final String STATUS_400_USERMESSAGE   = "BAD_REQUEST";

    public static final int    STATUS_501_EXCEPTIONID   = 500;
    public static final String STATUS_501_EXCEPTIONTEXT = "Requested HTTP Method Operation does not exist";
    public static final String STATUS_501_MOREINFO      = "Requested operation does not exist";
    public static final String STATUS_501_USERMESSAGE   = "SERVER_ERROR";

    private ErrorConstant() {
    }

}
