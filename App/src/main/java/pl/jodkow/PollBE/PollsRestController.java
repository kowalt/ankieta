package pl.jodkow.PollBE;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polls")
public class PollsRestController {

	@RequestMapping(method = RequestMethod.GET)
    public String getPolls() {
        return "abc get polls";
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public String createPoll() {
        return "abc create poll";
    }
	
}
