package nl.tiesnaber.knhb.knhb.controllers;

import nl.tiesnaber.knhb.knhb.model.*;
import nl.tiesnaber.knhb.knhb.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@CrossOrigin(origins = "*")
public class SpelerController {


    @Autowired
    private SpelerRepo spelerRepo;

    @PostMapping(path = "/spelers/add")
    public @ResponseBody
    Speler addClub(@RequestBody Speler club) {
        Speler c = club;
        Speler newClub = spelerRepo.save(c);
        return spelerRepo.findById(newClub.getId()).get();
    }

    @GetMapping(path = "/spelers/all")
    public @ResponseBody
    Iterable<Speler> getAllClubs() {
        return spelerRepo.findAll();
    }

    @GetMapping(path = "/spelers/getByID{id}")
    public @ResponseBody
    Speler getClubByID(@PathVariable Integer id) {
        return spelerRepo.findById(id).get();
    }


    @DeleteMapping(path = "/spelers/deleteByID{id}")
    public @ResponseBody
    void deleteSpelerByID(@PathVariable Integer id) {
        if (spelerRepo.findById(id).isPresent()) {
            spelerRepo.deleteById(id);

        } else {
            System.out.println("No such club found");
        }
    }

    @GetMapping(path="/spelers/byClubID{id}")
    public @ResponseBody Iterable<Speler> getPlayersByClubID(@PathVariable Integer id){

        return findByClubID(id);
    }

    private Iterable<Speler> findByClubID(Integer id){
        return spelerRepo.findByClubID(id);
    }

    @GetMapping(path="/spelers/byTeamID{id}")
    public @ResponseBody Iterable<Speler> getPlayersByTeamID(@PathVariable Integer id){

        return findByTeamID(id);
    }

    private Iterable<Speler> findByTeamID(Integer id){
        return spelerRepo.findByTeamID(id);
    }


    @PutMapping(path = "/spelers/update{id}")
    public @ResponseBody
    Speler updatePlayer(@RequestBody Speler newSpeler, @PathVariable Integer id) {
        return spelerRepo.findById(id)
                .map(speler -> {
                    speler.setNaam(newSpeler.getNaam());
                    speler.setAdres(newSpeler.getAdres());
                    speler.setPlaats(newSpeler.getPlaats());
                    speler.setPostcode(newSpeler.getPostcode());
                    speler.setEmail(newSpeler.getEmail());
                    speler.setSpeelgerechtigd(newSpeler.isSpeelgerechtigd());
                    return this.spelerRepo.save(speler);
                }).orElseGet(() -> {
                    newSpeler.setClub_ID(id);
                    return spelerRepo.save(newSpeler);
                });
    }

}
