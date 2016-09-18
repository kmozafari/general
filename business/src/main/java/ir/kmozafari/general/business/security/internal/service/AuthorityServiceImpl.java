package ir.kmozafari.general.business.security.internal.service;

import ir.kmozafari.general.business.security.internal.api.AuthorityService;
import ir.kmozafari.general.persistence.entity.auth.Authority;
import ir.kmozafari.general.persistence.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.mozafari on 8/16/2016.
 */

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority getAuthorityById(Long id) {
        return authorityRepository.findById(id);
    }

    @Override
    public Authority getAuthorityByName(String name) {
        return authorityRepository.findByName(name);
    }

    @Override
    public List<Authority> getAllAuthorities() {
        Iterable<Authority> authorityIterator = authorityRepository.findAll();
        List<Authority> authorities = new ArrayList<Authority>();
        for (Authority authority : authorityIterator) {
            authorities.add(authority);
        }
        return authorities;
    }

    @Override
    @Transactional
    public void addAuthority(Authority authority) {
        authorityRepository.save(authority);
    }
}
