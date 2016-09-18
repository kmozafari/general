package ir.kmozafari.general.business.security.external;

import ir.kmozafari.general.api.security.UserFacade;
import ir.kmozafari.general.business.security.internal.api.UserService;
import ir.kmozafari.general.business.security.mapper.MapperService;
import ir.kmozafari.general.common.dto.persistence.UserDto;
import ir.kmozafari.general.persistence.entity.auth.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by k.mozafari on 8/9/2016.
 */
@Service
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private MapperService mapperService;

    public void addUser(UserDto userDto) {
        User user = mapperService.map(userDto, User.class);
        userService.addUser(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return mapperService.map(allUsers, List.class);
    }
}
