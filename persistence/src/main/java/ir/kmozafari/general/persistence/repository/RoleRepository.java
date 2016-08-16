package ir.kmozafari.general.persistence.repository;

import ir.kmozafari.general.persistence.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by k.mozafari on 8/16/2016.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findById(Long id);

    Role findByName(String name);
}
