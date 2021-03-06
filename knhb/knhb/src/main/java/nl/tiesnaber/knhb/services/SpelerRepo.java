package nl.tiesnaber.knhb.services;

import nl.tiesnaber.knhb.model.Speler;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpelerRepo extends CrudRepository<Speler,Integer> {

    @Query(value = "SELECT * FROM db_example.speler WHERE club_id = :id", nativeQuery = true)
    Iterable<Speler> findByClubID(@Param("id") Integer id);

    @Query(value = "SELECT * FROM db_example.persoon persoon JOIN db_example.speler speler ON persoon.id  = speler.id WHERE speler.team_id = :id" , nativeQuery = true)
    Iterable<Speler> findByTeamID(@Param("id") Integer id);

}
