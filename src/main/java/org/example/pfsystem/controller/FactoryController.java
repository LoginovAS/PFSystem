package org.example.pfsystem.controller;

import org.example.pfsystem.model.Notification;
import org.example.pfsystem.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class FactoryController {

    private PostService postService;

    public FactoryController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/produce")
    public void requestProduction(@Valid @RequestBody Notification notification) {
        postService.send(notification);
    }

}
