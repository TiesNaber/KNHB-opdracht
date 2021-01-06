package nl.tiesnaber.knhb.services;

import nl.tiesnaber.knhb.model.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepo extends CrudRepository<Club,Integer> {
}
