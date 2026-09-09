package com.github.nikitacherkashi4.habituniverse.service;

import com.github.nikitacherkashi4.habituniverse.exception.UserNotFoundException;
import com.github.nikitacherkashi4.habituniverse.model.User;
import com.github.nikitacherkashi4.habituniverse.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
