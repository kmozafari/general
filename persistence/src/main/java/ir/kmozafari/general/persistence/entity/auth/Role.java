package ir.kmozafari.general.persistence.entity.auth;

import ir.kmozafari.general.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kourosh on 8/15/16.
 */

@Entity
@Table(name = "ROLE")
public class Role extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private String persianName;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable
    private List<Authority> authorities;

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

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
}
