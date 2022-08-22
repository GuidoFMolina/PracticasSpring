package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
NotificationService notified;

    public UserService() {

    }

    public UserService(NotificationService notified) {
        this.notified = notified;
    }

    public NotificationService getNotified() {
        return notified;
    }

    public void setNotified(NotificationService notified) {
        this.notified = notified;
    }
}
