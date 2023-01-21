package com.javalyh.common.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author li192
 */
public class UserCountLockException extends AuthenticationException {

    public UserCountLockException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserCountLockException(String msg) {
        super(msg);
    }
}
