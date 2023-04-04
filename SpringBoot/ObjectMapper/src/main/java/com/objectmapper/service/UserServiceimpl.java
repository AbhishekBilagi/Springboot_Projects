package com.objectmapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objectmapper.entity.User;
import com.objectmapper.httpClient.CustomHttpClient;
import com.objectmapper.repo.UserRepository;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private CustomHttpClient client;

	public UserServiceimpl() {};
    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
  
    public void save(List<User> users) {
        userRepository.saveAll(users);
    }
   
	public String saveApiData() {
		client.getHttpCall();
		return null;
	}
}

