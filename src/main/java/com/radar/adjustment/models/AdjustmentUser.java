package com.radar.adjustment.models;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AdjustmentUser {
    @NotNull
    private String userId;
    @NotNull
    private String userEmailAddress;
    private String userName;
    private String id;
}
