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

    @DeleteMapping(path = "/spelers/deleteAllClubs")
    public @ResponseBody
    void clearTable() {
        spelerRepo.deleteAll();
    }

    @DeleteMapping(path = "/spelers/deleteByID{id}")
    public @ResponseBody
    void deleteClubByID(@PathVariable Integer id) {
        if (spelerRepo.findById(id).isPresent()) {
            spelerRepo.deleteById(id);

        } else {
            System.out.println("No such club found");
        }
    }



    /*
    @PutMapping(path = "/clubs/update{id}")
    public @ResponseBody
    Speler updateClub(@RequestBody Speler newClub, @PathVariable Integer id) {
        return spelerRepo.findById(id)
                .map(club -> {
                    club.setNaam(newClub.getNaam());
                    club.setAdres(newClub.getAdres());
                    club.setPlaats(newClub.getPlaats());
                    club.setPostcode(newClub.getPostcode());
                    club.setTelefoonNummer(newClub.getTelefoonNummer());
                    club.setEmail(newClub.getEmail());
                    return this.spelerRepo.save(club);
                }).orElseGet(() -> {
                    newClub.setClub_ID(id);
                    return spelerRepo.save(newClub);
                });
    }
    */
}
