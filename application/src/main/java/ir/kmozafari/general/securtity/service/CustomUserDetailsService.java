package ir.kmozafari.general.securtity.service;

import ir.kmozafari.general.business.security.internal.api.UserService;
import ir.kmozafari.general.persistence.entity.User;
import ir.kmozafari.general.securtity.model.CustomUserDatails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kourosh on 8/12/16.
 */

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getUserByEmail(s);
        CustomUserDatails userDatails = new CustomUserDatails(user);
        return userDatails;
    }
}
