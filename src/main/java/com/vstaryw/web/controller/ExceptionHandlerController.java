package com.vstaryw.web.controller;

import com.vstaryw.web.util.ResultInfo;
import com.vstaryw.web.util.exception.ProcessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理器
 * @author yuw
 * @time 2016/7/18 9:58
 */
@ControllerAdvice
public class ExceptionHandlerController {

    Logger log = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest request,Exception ex){
        log.error(ex.getMessage(),ex);
        ResultInfo resultInfo= new ResultInfo();
        if(ex instanceof ProcessException){
            resultInfo.setErrorCode(((ProcessException) ex).getErrorCode());
            resultInfo.setErrorMsg(ex.getMessage());
        }else{
            resultInfo.setErrorCode("-1");
            resultInfo.setErrorMsg("系统异常");
        }
        return resultInfo;
    }
}
