package online.shopre.user_authentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class healthController {

    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("User Authentication service is running!!");
    }

}
