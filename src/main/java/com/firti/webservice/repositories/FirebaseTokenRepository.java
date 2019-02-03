package com.firti.webservice.repositories;

import com.firti.webservice.entities.firebase.FirebaseUserToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirebaseTokenRepository extends JpaRepository<FirebaseUserToken, Long> {
    FirebaseUserToken findByUserId(Long userId);
}
