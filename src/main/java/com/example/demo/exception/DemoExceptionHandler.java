package com.example.demo.exception;

import com.example.demo.domain.DemoJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class DemoExceptionHandler {

    public static final String SPRINGBOOT_ERROR_VIEW = "error";


    /*@ExceptionHandler(value = Exception.class)
    public Object errorHandle(HttpServletRequest request,
                   HttpServletResponse response, Exception e) throws Exception{
        e.printStackTrace();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.setViewName(SPRINGBOOT_ERROR_VIEW);
        return modelAndView;
    }*/

    @ExceptionHandler(value = Exception.class)
    public Object errorHandle(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        e.printStackTrace();

        if(isAjax(request)){
            return DemoJSONResult.errorException(e.getMessage());
        }else{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("exception", e);
            modelAndView.addObject("url", request.getRequestURL());
            modelAndView.setViewName(SPRINGBOOT_ERROR_VIEW);
            return modelAndView;
        }

    }


    public static boolean isAjax(HttpServletRequest request) {
        return (request.getHeader("X-Requested-With") != null
                && "XMLHttpRequest".equals(request.getHeader("X-Requested-with").toString())
        );
    }
}
