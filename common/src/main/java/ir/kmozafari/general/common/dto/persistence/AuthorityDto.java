package ir.kmozafari.general.common.dto.persistence;

/**
 * Created by kourosh on 8/15/16.
 */

public class AuthorityDto {

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
