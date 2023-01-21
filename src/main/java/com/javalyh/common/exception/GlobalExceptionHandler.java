package com.javalyh.common.exception;

import com.javalyh.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全部异常处理
 * @author li192
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public R handler(RuntimeException e){
        log.error("运行时异常：---------{}"+e.getMessage());
        return R.error(e.getMessage());
    }
}
