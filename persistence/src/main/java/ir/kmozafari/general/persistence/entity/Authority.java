package ir.kmozafari.general.persistence.entity;

import javax.persistence.*;

/**
 * Created by kourosh on 8/15/16.
 */

@Entity
@Table(name = "AUTHORITY")
public class Authority {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String persianName;

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
