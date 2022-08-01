package com.radar.adjustment.data;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "adjustment_audit")
@NamedQuery(name = "AdjustmentAudit.findAll", query = "SELECT a FROM AdjustmentAudit a")
public class AdjustmentAudit {
    @Id
    private Integer auditId;

    @ManyToOne
    @JoinColumn(name = "adjustment_id")
    private Adjustment adjustment;
}
