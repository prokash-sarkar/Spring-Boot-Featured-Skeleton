package com.firti.webservice.exceptions.unknown;

import com.firti.webservice.exceptions.forbidden.ForbiddenException;

public class WtfException extends ForbiddenException{
    public WtfException() {
    }

    public WtfException(String message) {
        super(message);
    }
}
