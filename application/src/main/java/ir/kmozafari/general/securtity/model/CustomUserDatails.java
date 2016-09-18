package ir.kmozafari.general.securtity.model;


import ir.kmozafari.general.persistence.entity.auth.Role;
import ir.kmozafari.general.persistence.entity.auth.User;
import ir.kmozafari.general.persistence.util.SecurityUtil;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.*;

/**
 * Created by kourosh on 8/12/16.
 */
public class CustomUserDatails extends org.springframework.security.core.userdetails.User {


    private User user;

    public CustomUserDatails(User user) {
        super(user.getUserId(), user.getPassword(), AuthorityUtils.createAuthorityList(SecurityUtil.authorityList(user.getRoles())));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

    public List<Role> getRoles() {
        return user.getRoles();
    }
}
