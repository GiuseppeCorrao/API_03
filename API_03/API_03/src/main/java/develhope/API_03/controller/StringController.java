package develhope.API_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String concat2String(String mandatory,String string) {

        mandatory = "welcome ";

        if (string == null) {
            return mandatory;
        } else {
            return mandatory + string;
        }

    }
}
