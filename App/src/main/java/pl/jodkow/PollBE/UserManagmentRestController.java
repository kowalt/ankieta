package pl.jodkow.PollBE;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

class RegistrationUserData
{
	String login;
	String SHA256ofPassword;
	String email;
}

class LoginUserData
{
	String login;
	String SHA256ofPassword;
}

@RestController
@RequestMapping("/users/")
public class UserManagmentRestController {
	@RequestMapping(value="register", method = RequestMethod.POST)
    public String registerUser(@RequestBody RegistrationUserData data)
	{
        return "abc";
    }
	
	@RequestMapping(value="login", method = RequestMethod.POST)
    public String loginUser(@RequestBody LoginUserData data) 
	{
        return "abc";
    }
	
	@RequestMapping(value="logout", method = RequestMethod.POST)
    public String logOutUser() 
	{
        return "abc";
    }
}
