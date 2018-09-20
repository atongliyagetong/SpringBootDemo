/*
package com.example.demo.exception;

import com.example.demo.domain.DemoJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class DemoAjaxExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public DemoJSONResult defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception{
        e.printStackTrace();
        return DemoJSONResult.errorException(e.getMessage());
    }
}
*/
