package com.dhis.surveillance.exception;

public class TokenException extends RuntimeException {
    private String retCode;
    private String mesDesc;

    public TokenException(){
        super();
    }

    public TokenException(String message){
        super(message);
        mesDesc = message;
    }

    public TokenException(String retCode, String mesDesc){
        super();
        this.retCode = retCode;
        this.mesDesc = mesDesc;
    }

    public String getRetCode(){
        return retCode;
    }
    public String getMesDesc(){
        return mesDesc;
    }
}
