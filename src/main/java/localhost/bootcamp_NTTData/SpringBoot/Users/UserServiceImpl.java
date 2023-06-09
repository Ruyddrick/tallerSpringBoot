package localhost.bootcamp_NTTData.SpringBoot.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import localhost.bootcamp_NTTData.SpringBoot.Model.SpringUsers;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<SpringUsers> findAll() {
		return userRepository.findAll();
	}

	@Override
	public SpringUsers getUserById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(SpringUsers user) {
		userRepository.delete(user);
		
	}
	
}
