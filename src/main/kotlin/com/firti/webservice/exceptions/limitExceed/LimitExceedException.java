package com.firti.webservice.exceptions.limitExceed;

import com.firti.webservice.exceptions.invalid.InvalidException;

public class LimitExceedException extends InvalidException {
    public LimitExceedException() {
    }

    public LimitExceedException(String message) {
        super(message);
    }

}
