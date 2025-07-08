package com.example.boardbe.domain.user.exception;

import com.example.boardbe.global.error.exception.CustomException;
import com.example.boardbe.global.error.exception.ErrorCode;

public class UserAlreadyExitsException extends CustomException {

    public static final CustomException EXCEPTION = new UserAlreadyExitsException();

    private UserAlreadyExitsException() {
        super(ErrorCode.ALREADY_USER_EXITS);
    }
}