package com.radar.adjustment.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AdjustmentAuditDto {
    private Integer auditId;
    private AdjustmentDto adjustmentDto;
}
