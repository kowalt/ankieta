package pl.jodkow.PollBE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //any HTTP types
    @RequestMapping("/test1")
    public String test1() {
        return "abc";
    }
    
    //first method for GET type
    @RequestMapping(value="/test2", method = RequestMethod.GET)
    public String test2() {
        return "abc";
    }
    
    //second method for GET type
    @GetMapping("/test3")
    public String test3(@RequestParam(value="name", defaultValue="World") String name) {
        return "abc i wprowadzono : " + name;
    }
}