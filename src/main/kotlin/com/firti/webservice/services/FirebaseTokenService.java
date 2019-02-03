package com.firti.webservice.services;

import com.firti.webservice.entities.firebase.FirebaseUserToken;
import com.firti.webservice.exceptions.invalid.InvalidException;
import com.firti.webservice.exceptions.notfound.FirebaseTokenNotFoundException;
import com.firti.webservice.exceptions.notfound.UserNotFoundException;

public interface FirebaseTokenService {
    FirebaseUserToken save(FirebaseUserToken token) throws InvalidException;

    FirebaseUserToken get(Long userId) throws FirebaseTokenNotFoundException;

    FirebaseUserToken save(Long userId, String token) throws InvalidException, UserNotFoundException;
}
