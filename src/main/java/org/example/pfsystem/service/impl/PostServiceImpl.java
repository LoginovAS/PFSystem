package org.example.pfsystem.service.impl;

import org.example.pfsystem.model.Notification;
import org.example.pfsystem.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostServiceImpl implements PostService {

    /**
     * Temporary sync solution to check workflow.
     * @param notification
     */
    @Override
    public void send(Notification notification) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8080/api/supply", notification, String.class);
        System.out.println(responseEntity.getBody());
    }
}
