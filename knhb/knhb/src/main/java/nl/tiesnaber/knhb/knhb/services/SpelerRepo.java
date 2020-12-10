package nl.tiesnaber.knhb.knhb.services;

import nl.tiesnaber.knhb.knhb.model.Speler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpelerRepo extends CrudRepository<Speler,Integer> {
}
