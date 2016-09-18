package com.test;

import ir.kmozafari.application.Application;
import ir.kmozafari.general.business.security.internal.api.AuthorityService;
import ir.kmozafari.general.persistence.entity.auth.Authority;
import ir.kmozafari.general.persistence.entity.auth.Role;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.*;

/**
 * Created by kourosh on 8/18/16.
 **/


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("mock-test")
public class MockTest {


    @MockBean
    private AuthorityService authorityService;

    @Before
    public void beforeTest() {
        given(this.authorityService.getAuthorityById(1L)).willReturn(getAuthority(1L, "auth1"));
        given(this.authorityService.getAuthorityById(2L)).willReturn(getAuthority(2L, "auth2"));
        given(this.authorityService.getAuthorityById(3L)).willReturn(getAuthority(3L, "auth3"));

    }


    @Test
    public void addRoleTest() {
        Role role = new Role();
        role.setName("role1");
        Authority authority = authorityService.getAuthorityById(2L);
        Authority authority1 = authorityService.getAuthorityById(3L);
        List<Authority> authorities = new ArrayList<Authority>();
        authorities.add(authority);
        authorities.add(authority1);
        role.setAuthorities(authorities);

    }


    private Authority getAuthority(Long id, String name) {
        Authority authority = new Authority();
        authority.setId(id);
        authority.setName(name);
        return authority;
    }

}
