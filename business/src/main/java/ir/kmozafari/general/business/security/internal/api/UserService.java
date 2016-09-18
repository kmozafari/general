package ir.kmozafari.general.business.security.internal.api;


import ir.kmozafari.general.persistence.entity.auth.Role;
import ir.kmozafari.general.persistence.entity.auth.User;

import java.util.List;

/**
 * Created by k.mozafari on 8/9/2016.
 */
public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    void addUser(User user);

    List<Role> getUserRoles(Long id);

    List<Role> getUserRoles(String userId);
}
