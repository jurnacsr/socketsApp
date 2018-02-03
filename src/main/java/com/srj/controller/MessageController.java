package com.srj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

    @Autowired
    SimpMessagingTemplate template;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/message/{sendToId}", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity restMessage(@PathVariable String sendToId, @RequestBody String message) {
        LOG.info("info received message request");
        template.convertAndSend("/message/" + sendToId, message);
        return new ResponseEntity(HttpStatus.OK);
    }
}
