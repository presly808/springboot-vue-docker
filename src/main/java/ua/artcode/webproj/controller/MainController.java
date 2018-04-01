package ua.artcode.webproj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.artcode.webproj.model.MyMessage;

/**
 * Created by serhii on 25.03.18.
 */
@RestController
public class MainController {

    @GetMapping("/hello")
    private ResponseEntity<MyMessage> hello(){
        return new ResponseEntity<>(new MyMessage("Hello", "some body"), HttpStatus.OK);
    }

}
