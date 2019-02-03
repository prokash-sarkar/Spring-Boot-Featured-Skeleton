package com.firti.webservice.services;


import com.firti.webservice.entities.AcValidationToken;
import com.firti.webservice.entities.User;
import com.firti.webservice.exceptions.forbidden.ForbiddenException;

public interface AcValidationTokenService {
    AcValidationToken save(AcValidationToken acValidationToken);
    AcValidationToken findOne(Long id);
    AcValidationToken findByToken(String token) throws ForbiddenException;
    void delete(Long id);
    boolean isTokenValid(String token) throws ForbiddenException;
    boolean isLimitExceeded(User user);
}
