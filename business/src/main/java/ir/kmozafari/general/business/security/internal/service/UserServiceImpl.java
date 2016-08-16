package ir.kmozafari.general.business.security.internal.service;

import ir.kmozafari.general.business.security.internal.api.UserService;
import ir.kmozafari.general.persistence.entity.Role;
import ir.kmozafari.general.persistence.entity.User;
import ir.kmozafari.general.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return userRepository.findByUserId(email);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<Role> getUserRoles(Long id) {
        User user = userRepository.findById(id);
        return user.getRoles();
    }

    @Override
    @Transactional
    public List<Role> getUserRoles(String userId) {
        User user = userRepository.findByUserId(userId);
        return user.getRoles();
    }


}
