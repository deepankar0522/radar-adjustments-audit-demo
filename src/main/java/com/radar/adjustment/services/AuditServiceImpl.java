package com.radar.adjustment.services;

import com.radar.adjustment.data.AdjustmentAudit;
import com.radar.adjustment.repositories.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService{

    @Autowired
    AuditRepository auditRepository;

    @Override
    public List<AdjustmentAudit> getAuditByAdjustmentId(Integer adjustmentId) {
        List<AdjustmentAudit> adjustmentAuditList = auditRepository.getAuditByAdjustmentId(adjustmentId);
        return adjustmentAuditList;
    }
}
