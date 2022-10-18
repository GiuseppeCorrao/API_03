package develhope.API_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String concat2String(@RequestParam String mandatory, String string) {


        if (string == null) {
            return mandatory;
        } else {
            return mandatory + string;
        }

    }
}
