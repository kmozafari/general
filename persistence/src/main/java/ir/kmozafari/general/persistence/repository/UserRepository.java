package ir.kmozafari.general.persistence.repository;

import ir.kmozafari.general.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by k.mozafari on 8/9/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserId(String userId);

    User findById(Long id);

}
