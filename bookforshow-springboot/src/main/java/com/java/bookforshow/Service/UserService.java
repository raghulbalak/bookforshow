package com.java.bookforshow.Service;

import com.java.bookforshow.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User getUserById(String id);

    public List<User> getAllUsers();

    public User createUser(User user);

    public User updateUser(User user);

}
