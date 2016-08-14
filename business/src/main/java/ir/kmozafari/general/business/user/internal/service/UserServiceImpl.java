package ir.kmozafari.general.business.user.internal.service;

import ir.kmozafari.general.business.user.internal.api.UserService;
import ir.kmozafari.general.persistence.entity.User;
import ir.kmozafari.general.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.mozafari on 8/9/2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Iterable<User> all = userRepository.findAll();
        for (User user : all) {
            users.add(user);
        }
        return users;
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }


}
