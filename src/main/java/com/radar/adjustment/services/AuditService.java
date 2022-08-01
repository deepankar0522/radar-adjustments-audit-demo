package com.radar.adjustment.services;

import com.radar.adjustment.data.AdjustmentAudit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuditService {
    List<AdjustmentAudit> getAuditByAdjustmentId(Integer adjustmentId);
}
