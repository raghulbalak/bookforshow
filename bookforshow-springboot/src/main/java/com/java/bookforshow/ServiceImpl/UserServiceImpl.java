package com.java.bookforshow.ServiceImpl;

import com.java.bookforshow.Entity.User;
import com.java.bookforshow.Repository.UserRepository;
import com.java.bookforshow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userRepository;

    public User getUserById(String idStr) {
        Long id;
        try {
            id = Long.parseLong(idStr);
        } catch (NumberFormatException exception) {
            id = Long.valueOf(0);
        }
        Optional<User> user = this.userRepository.findById(id);
        if(user.isEmpty()) {
            return null;
        }
        return user.get();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        return users;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
