package com.adaptive.environments.alert_persistance_service.repository;


import com.adaptive.environments.alert_persistance_service.model.AlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRecordRepository extends JpaRepository<AlertRecord, Long> {
}
