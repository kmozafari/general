package ir.kmozafari.general.business.security.internal.service;

import ir.kmozafari.general.business.security.internal.api.RoleService;
import ir.kmozafari.general.persistence.entity.Role;
import ir.kmozafari.general.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public List<Role> getAllRoles() {
        Iterable<Role> roleIterator = roleRepository.findAll();
        List<Role> roles = new ArrayList<Role>();

        for (Role role : roleIterator) {
            roles.add(role);
        }
        return roles;
    }

    @Override
    @Transactional
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
