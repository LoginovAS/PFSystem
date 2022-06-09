package org.example.pfsystem.service;

import org.example.pfsystem.model.Notification;

public interface PostService {

    // TODO: Create async implementation with Kafka.
    void send(Notification notification);

}
