package nl.tiesnaber.knhb.knhb.controllers;
import nl.tiesnaber.knhb.knhb.model.*;
import nl.tiesnaber.knhb.knhb.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller // This means that this class is a Controller
@CrossOrigin(origins = "*")
public class TeamController {

    @Autowired
    private TeamRepo teamRepo;

    @PostMapping(path = "/teams/add")
    public @ResponseBody Team addTeam(@RequestBody Team team) {
        Team temp = team;
        Team newTeam = teamRepo.save(temp);
        return teamRepo.findById(newTeam.getTeam_ID()).get();
    }

    @GetMapping(path = "/teams/all")
    public @ResponseBody
    Iterable<Team> getAllTeams() {
        return teamRepo.findAll();
    }



    @GetMapping(path = "/teams/getByID{id}")
    public @ResponseBody
    Team getTeamByID(@PathVariable Integer id) {
        return teamRepo.findById(id).get();
    }

    @DeleteMapping(path = "/teams/deleteByID{id}")
    public @ResponseBody
    void deleteTeamByID(@PathVariable Integer id) {
        if (teamRepo.findById(id).isPresent()) {
            teamRepo.deleteById(id);
        } else {
            System.out.println("No such team found");
        }

    }

    @PutMapping(path = "/teams/update{id}")
    public @ResponseBody
    Team updateTeam(@RequestBody Team newTeam, @PathVariable Integer id) {
        return teamRepo.findById(id)
                .map(team -> {
                    team.setTeamNaam(newTeam.getTeamNaam());
                    return teamRepo.save(team);
                }).orElseGet(() -> {
                    newTeam.setTeam_ID(id);
                    return teamRepo.save(newTeam);
                });
    }

    @GetMapping(path="/teams/byClubID{id}")
    public @ResponseBody Iterable<Team> getTeamsByClubId(@PathVariable Integer id){

        return findByClubID(id);
    }

    private Iterable<Team> findByClubID(Integer id){
        return teamRepo.findByClubID(id);
    }

}
