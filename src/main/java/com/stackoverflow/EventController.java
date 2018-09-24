package com.stackoverflow;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public ResponseEntity post(@RequestBody Event event) {
        System.out.println("Event posted: " + event.toString());
        return ResponseEntity.ok(event);
    }

}
