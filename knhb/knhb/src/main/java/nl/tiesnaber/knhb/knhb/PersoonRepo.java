package nl.tiesnaber.knhb.knhb;

import org.springframework.data.repository.CrudRepository;

import nl.tiesnaber.knhb.knhb.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PersoonRepo extends CrudRepository<Persoon, Integer> {

}