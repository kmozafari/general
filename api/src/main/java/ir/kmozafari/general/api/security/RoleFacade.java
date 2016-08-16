package ir.kmozafari.general.api.security;

import ir.kmozafari.general.common.dto.persistence.RoleDto;

import java.util.List;

/**
 * Created by k.mozafari on 8/9/2016.
 */
public interface RoleFacade {

    void addRole(RoleDto roleDto);

    RoleDto getRole(String name);

    List<RoleDto> getAllRoles();
}
