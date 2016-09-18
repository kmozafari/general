package ir.kmozafari.general.business.security.internal.api;

import ir.kmozafari.general.persistence.entity.auth.Authority;

import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */
public interface AuthorityService {

    Authority getAuthorityById(Long id);

    Authority getAuthorityByName(String name);

    List<Authority> getAllAuthorities();

    void addAuthority(Authority authority);
}
