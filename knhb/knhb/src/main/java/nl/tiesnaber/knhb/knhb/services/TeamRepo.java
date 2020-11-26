package nl.tiesnaber.knhb.knhb.services;

import nl.tiesnaber.knhb.knhb.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepo extends CrudRepository<Team, Integer> {
}
