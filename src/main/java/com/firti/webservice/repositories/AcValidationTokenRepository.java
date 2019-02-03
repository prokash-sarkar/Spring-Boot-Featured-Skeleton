package com.firti.webservice.repositories;


import com.firti.webservice.entities.AcValidationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AcValidationTokenRepository extends JpaRepository<AcValidationToken, Long> {
    AcValidationToken findFirstByTokenOrderByIdDesc(String token);

    int countByUserIdAndCreatedBetween(Long id, Date fromDate, Date toDate);
}
