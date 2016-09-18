package ir.kmozafari.general.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by kourosh on 9/18/16.
 */

@Entity
public class Opinion extends BaseEntity {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
