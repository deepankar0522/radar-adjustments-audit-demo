package com.radar.adjustment.data;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id", nullable = false)
    private Integer notificationId;

    @Column(name = "notification_message", nullable = false)
    private String notificationMessage;

    @Column(name = "notificationType", nullable = false)
    private String notificationType;

}
