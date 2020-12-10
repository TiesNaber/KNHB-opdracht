package nl.tiesnaber.knhb.knhb.services;

import nl.tiesnaber.knhb.knhb.model.Persoon;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called PersoonRepo
// CRUD refers Create, Read, Update, Delete

@Repository
@Primary
public interface PersoonRepo extends CrudRepository<Persoon, Integer> {

}