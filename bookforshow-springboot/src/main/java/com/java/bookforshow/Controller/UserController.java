package com.java.bookforshow.Controller;

import com.java.bookforshow.Entity.User;
import com.java.bookforshow.Service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());
    @Autowired
    public UserService userService;

    @GetMapping
    @RequestMapping("{id}")
    public ResponseEntity<User> getUser(@PathParam("id") String id) {
        User user = this.userService.getUserById(id);
        LOG.log(Level.INFO, "user:{0}", user);
        return ResponseEntity.ok(user);
    }
}
