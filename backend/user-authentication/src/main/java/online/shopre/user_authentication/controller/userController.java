package online.shopre.user_authentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("/users")
    public ResponseEntity<String> healthCheck(){

        return ResponseEntity.ok("User authentiation service is runnning");
    }

}
