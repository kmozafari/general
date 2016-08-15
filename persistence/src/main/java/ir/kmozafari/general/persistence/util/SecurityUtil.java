package ir.kmozafari.general.persistence.util;

import ir.kmozafari.general.persistence.entity.Authority;
import ir.kmozafari.general.persistence.entity.Role;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by kourosh on 8/16/16.
 */
public class SecurityUtil {

    public static String[] authorityList(List<Role> roles) {
        Set<Authority> authoritySet = getAuthorities(roles);

        String[] authorities = new String[authoritySet.size()];

        Iterator<Authority> iterator = authoritySet.iterator();

        for (int i = 0; iterator.hasNext(); i++) {
            authorities[i] = iterator.next().getName();
        }
        return authorities;
    }

    public static Set<Authority> getAuthorities(List<Role> roles) {
        Set<Authority> authoritySet = new HashSet<Authority>();
        for (Role role : roles) {
            List<Authority> authorities = role.getAuthorities();
            for (Authority authority : authorities) {
                authoritySet.add(authority);
            }
        }
        return authoritySet;
    }
}
