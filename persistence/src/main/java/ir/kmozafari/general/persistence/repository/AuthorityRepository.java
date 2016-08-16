package ir.kmozafari.general.persistence.repository;

import ir.kmozafari.general.persistence.entity.Authority;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by k.mozafari on 8/16/2016.
 */
public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findById(Long id);

    Authority findByName(String name);
}
