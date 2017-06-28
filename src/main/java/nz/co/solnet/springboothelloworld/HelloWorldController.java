package nz.co.solnet.springboothelloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rn1466 on 28/06/17.
 */
@RestController
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HelloWorldController {
    @RequestMapping(value="/{message}")
    public ResponseEntity<String> sayHello(@PathVariable("message") String message) {
        return new ResponseEntity<>("Hello, " + message, HttpStatus.OK);
    }
}
