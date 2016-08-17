package ir.kmozafari.general.business.security.external;

import ir.kmozafari.general.api.security.RoleFacade;
import ir.kmozafari.general.business.security.internal.api.RoleService;
import ir.kmozafari.general.business.security.mapper.MapperService;
import ir.kmozafari.general.common.dto.persistence.RoleDto;
import ir.kmozafari.general.persistence.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */

@Service
public class RoleFacadeImpl implements RoleFacade {

    @Autowired
    private RoleService roleService;

    @Autowired
    private MapperService mapperService;

    @Override
    public void addRole(RoleDto roleDto) {
        Role role = mapperService.map(roleDto, Role.class);
        roleService.addRole(role);
    }

    @Override
    public RoleDto getRole(String name) {
        Role role = roleService.getRoleByName(name);
        return mapperService.map(role, RoleDto.class);
    }

    @Override
    public RoleDto getRole(Long id) {
        Role role = roleService.getRoleById(id);
        return mapperService.map(role, RoleDto.class);
    }

    @Override
    public List<RoleDto> getAllRoles() {
        List<Role> allRoles = roleService.getAllRoles();
        return mapperService.map(allRoles, List.class);
    }
}
