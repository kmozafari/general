package ir.kmozafari.general.api.user;

import ir.kmozafari.general.common.dto.persistence.UserDto;

/**
 * Created by k.mozafari on 8/9/2016.
 */
public interface UserFacade {

    void addUser(UserDto userDto);
}
