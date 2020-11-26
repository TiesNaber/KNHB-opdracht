package nl.tiesnaber.knhb.knhb.services;

import nl.tiesnaber.knhb.knhb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
