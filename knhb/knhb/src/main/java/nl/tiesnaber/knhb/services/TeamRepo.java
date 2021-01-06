package nl.tiesnaber.knhb.services;

import nl.tiesnaber.knhb.model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface TeamRepo extends CrudRepository<Team, Integer> {

    @Query(value = "SELECT * FROM db_example.team WHERE club_id = :id", nativeQuery = true)
    Iterable<Team> findByClubID(@Param("id") Integer id);
}
