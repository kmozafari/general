package ir.kmozafari.general.common.dto.persistence;

import java.util.List;

/**
 * Created by kourosh on 8/15/16.
 */

public class RoleDto {


    private Long id;

    private String name;

    private String persianName;

    private List<AuthorityDto> authorities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersianName() {
        return persianName;
    }

    public void setPersianName(String persianName) {
        this.persianName = persianName;
    }

    public List<AuthorityDto> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityDto> authorities) {
        this.authorities = authorities;
    }
}
