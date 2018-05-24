package pl.jodkow.PollBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import pl.jodkow.PollBE.dao.UserRepository;
import pl.jodkow.PollBE.pojo.User;

@Component
public class SecUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByLogin(username);
				
		if(user == null)
		{
			throw new UsernameNotFoundException(username);
		}
		else 
		{
			UserDetails details = new SecUserDetails(user);
			return details;
		}
	}

}
