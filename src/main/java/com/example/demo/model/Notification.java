package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
public class Notification implements Serializable {
    private String notificationId;
    private Date createdAt;
    private boolean seen;
    private String message;

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", createdAt=" + createdAt +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }
}
