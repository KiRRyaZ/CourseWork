package coursework.admin.repositories;

import coursework.admin.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path= "roles")
public interface RoleRepo extends MongoRepository<Role, String> {
    boolean existsByName(String name);
    Role findByName(String name);
}
