package ir.kmozafari.general.business.security.external;

import ir.kmozafari.general.api.security.AuthorityFacade;
import ir.kmozafari.general.business.security.internal.api.AuthorityService;
import ir.kmozafari.general.business.security.mapper.MapperService;
import ir.kmozafari.general.common.dto.persistence.AuthorityDto;
import ir.kmozafari.general.persistence.entity.auth.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */

@Service
public class AuthorityFacadeImpl implements AuthorityFacade {

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    private MapperService mapperService;

    @Override
    public void addAuthority(AuthorityDto authorityDto) {
        Authority authority = mapperService.map(authorityDto, Authority.class);
        authorityService.addAuthority(authority);
    }

    @Override
    public AuthorityDto getAuthority(String name) {
        Authority authority = authorityService.getAuthorityByName(name);
        return mapperService.map(authority, AuthorityDto.class);
    }

    @Override
    public AuthorityDto getAuthority(Long id) {
        Authority authority = authorityService.getAuthorityById(id);
        return mapperService.map(authority, AuthorityDto.class);
    }

    @Override
    public List<AuthorityDto> getAllAuthorities() {
        List<Authority> allAuthorities = authorityService.getAllAuthorities();
        return mapperService.map(allAuthorities, List.class);
    }
}
