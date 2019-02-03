package com.firti.webservice.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firti.webservice.entities.firebase.PushNotification;
import com.firti.webservice.exceptions.invalid.InvalidException;
import com.firti.webservice.exceptions.notfound.NotFoundException;
import com.firti.webservice.exceptions.unknown.UnknownException;

public interface NotificationService {
    void sendNotification(Long userId, PushNotification notification) throws InvalidException, NotFoundException, JsonProcessingException, UnknownException;

    void sendNotification(PushNotification notification) throws InvalidException, JsonProcessingException, UnknownException;

}
