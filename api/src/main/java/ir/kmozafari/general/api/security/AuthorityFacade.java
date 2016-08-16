package ir.kmozafari.general.api.security;

import ir.kmozafari.general.common.dto.persistence.AuthorityDto;

/**
 * Created by k.mozafari on 8/9/2016.
 */
public interface AuthorityFacade {

    void addAuthority(AuthorityDto authorityDto);

    AuthorityDto getAuthority(String name);
}
