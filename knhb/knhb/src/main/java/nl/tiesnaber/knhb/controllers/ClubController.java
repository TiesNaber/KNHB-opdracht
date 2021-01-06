package nl.tiesnaber.knhb.controllers;

import nl.tiesnaber.knhb.model.*;
import nl.tiesnaber.knhb.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@CrossOrigin(origins = "*")
public class ClubController {

    @Autowired
    private ClubRepo clubRepo;

    @PostMapping(path = "/clubs/add")
    public @ResponseBody
    Club addClub(@RequestBody Club club) {
        Club c = club;
        Club newClub = clubRepo.save(c);
        return clubRepo.findById(newClub.getClub_ID()).get();
    }

    @GetMapping(path = "/clubs/all")
    public @ResponseBody
    Iterable<Club> getAllClubs() {
        return clubRepo.findAll();
    }

    @GetMapping(path = "/clubs/getByID{id}")
    public @ResponseBody
    Club getClubByID(@PathVariable Integer id) {
        return clubRepo.findById(id).get();
    }


    @DeleteMapping(path = "/clubs/deleteByID{id}")
    public @ResponseBody
    void deleteClubByID(@PathVariable Integer id) {
        if (clubRepo.findById(id).isPresent()) {
            clubRepo.deleteById(id);

        } else {
            System.out.println("No such club found");
        }
    }

    @PutMapping(path = "/clubs/update{id}")
    public @ResponseBody
    Club updateClub(@RequestBody Club newClub, @PathVariable Integer id) {
        return clubRepo.findById(id)
                .map(club -> {
                    club.setNaam(newClub.getNaam());
                    club.setAdres(newClub.getAdres());
                    club.setPlaats(newClub.getPlaats());
                    club.setPostcode(newClub.getPostcode());
                    club.setTelefoonNummer(newClub.getTelefoonNummer());
                    club.setEmail(newClub.getEmail());
                    return this.clubRepo.save(club);
                }).orElseGet(() -> {
                    newClub.setClub_ID(id);
                    return clubRepo.save(newClub);
                });
    }
}

