package com.dhis.surveillance.controller;

import com.dhis.surveillance.exception.TokenException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map handleAllExceptions(Exception ex, WebRequest request) {
        if (ex instanceof TokenException) {
            Map map = new HashMap();
            map.put("code",((TokenException) ex).getRetCode());
            map.put("desc",((TokenException) ex).getMesDesc());
            return map;
        }
        Map map = new HashMap();
        map.put("error",ex.getMessage());
        return map;
    }
}
