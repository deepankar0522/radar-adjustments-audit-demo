package com.radar.adjustment.controllers;

import com.radar.adjustment.data.AdjustmentAudit;
import com.radar.adjustment.services.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    AuditService auditService;

    @GetMapping("/{adjustmentId}")
    public List<AdjustmentAudit> getAuditByAdjustmentId(Integer adjustmentId){
        return auditService.getAuditByAdjustmentId(adjustmentId);
    }
}
