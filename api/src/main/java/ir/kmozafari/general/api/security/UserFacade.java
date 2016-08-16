package ir.kmozafari.general.api.security;

import ir.kmozafari.general.common.dto.persistence.UserDto;

import java.util.List;

/**
 * Created by k.mozafari on 8/9/2016.
 */
public interface UserFacade {

    void addUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
