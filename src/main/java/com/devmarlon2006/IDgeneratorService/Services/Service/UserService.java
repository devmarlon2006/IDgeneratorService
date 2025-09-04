package com.devmarlon2006.IDgeneratorService.Services.Service;

import com.devmarlon2006.IDgeneratorService.Data.UserRepository;
import com.devmarlon2006.IDgeneratorService.Services.model.User.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save( user );
    }

    public void deletarUser(String id) {
        userRepository.deleteById(id);
    }

    public User getUserByID(String id){
        return userRepository.findById(id).orElse(null);
    }
}
