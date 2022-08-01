package com.radar.adjustment.repositories;

import com.radar.adjustment.data.AdjustmentAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditRepository extends JpaRepository<AuditRepository, Integer> {

    @Query(value = "SELECT * FROM AdjustmentAudit WHERE adjustmentId = :adjustmentId", nativeQuery = true)
    List<AdjustmentAudit> getAuditByAdjustmentId(Integer adjustmentId);
}
