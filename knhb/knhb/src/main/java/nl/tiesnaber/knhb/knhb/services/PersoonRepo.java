package nl.tiesnaber.knhb.knhb.services;

import nl.tiesnaber.knhb.knhb.model.Persoon;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called PersoonRepo
// CRUD refers Create, Read, Update, Delete

public interface PersoonRepo extends CrudRepository<Persoon, Integer> {

}