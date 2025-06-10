package com.example.boardbe.domain.board.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/board")
public class BorderController {
    @GetMapping("/hi")
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok("안녕하세용?ㅎㅎ");
    }
}
