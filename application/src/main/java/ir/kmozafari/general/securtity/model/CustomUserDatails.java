package ir.kmozafari.general.securtity.model;


import ir.kmozafari.general.common.model.persistence.Role;
import ir.kmozafari.general.persistence.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Collection;

/**
 * Created by kourosh on 8/12/16.
 */
public class CustomUserDatails extends org.springframework.security.core.userdetails.User {


    private User user;

    public CustomUserDatails(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

    public Role getRole() {
        return user.getRole();
    }
}
