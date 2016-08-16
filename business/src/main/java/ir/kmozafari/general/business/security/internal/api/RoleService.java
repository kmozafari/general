package ir.kmozafari.general.business.security.internal.api;

import ir.kmozafari.general.persistence.entity.Role;

import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */

public interface RoleService {
    Role getRoleById(Long id);

    Role getRoleByName(String name);

    List<Role> getAllRoles();

    void addRole(Role role);
}
