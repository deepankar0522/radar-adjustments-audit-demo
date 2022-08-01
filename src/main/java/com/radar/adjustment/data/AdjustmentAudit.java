package com.radar.adjustment.data;

import com.radar.adjustment.models.AdjustmentStatusEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "adjustment_audit")
@NamedQuery(name = "AdjustmentAudit.findAll", query = "SELECT a FROM AdjustmentAudit a")
public class AdjustmentAudit {

    @Id
    @Column(name = "audit_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer auditId;

    @Column(name = "adjustment_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private AdjustmentStatusEnum adjustmentStatus;

    @Column(name = "event_date_time", nullable = false)
    private Date eventDateTime;

    @Column(name = "adjustment_id", nullable = false)
    private Integer adjustmentId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @OneToMany(targetEntity = Notification.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "audit_id", referencedColumnName = "audit_id")
    private List<Notification> notifications;

    @Column(name = "from_adjustment_state", nullable = false)
    private String fromAdjustmentState;

    @Column(name = "to_adjustment_state", nullable = false)
    private String toAdjustmentState;

    @Column(name = "adjustment_comment", nullable = false)
    private String adjustmentComment;
}
