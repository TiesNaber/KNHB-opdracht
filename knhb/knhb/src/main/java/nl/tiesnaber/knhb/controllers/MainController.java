package nl.tiesnaber.knhb.controllers;

import nl.tiesnaber.knhb.model.*;
import nl.tiesnaber.knhb.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@CrossOrigin(origins = "*")
public class MainController {
    @Autowired // This means to get the bean called PersoonRepo
    // Which is auto-generated by Spring, we will use it to handle the data
    private PersoonRepo persoonRepo;

    @Autowired
    private SpelerRepo spelerRepo; // Get spelerRepo Bean;

    @Autowired
    private BegeleiderRepo begeleiderRepo;

    @Autowired
    private BegeleiderRolRepo begeleiderRolRepo;

    @Autowired
    private ScheidsrechterRepo scheidsrechterRepo;

    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private WedstrijdRepo wedstrijdRepo;



    @Autowired
    private UserRepo userRepo;




    @GetMapping(path="/begeleiders/getAll")
    public @ResponseBody Iterable<Begeleider> getAllBegeleiders(){
        return begeleiderRepo.findAll();
    }



    @GetMapping(path="/scheidsrechters/getAll")
    public @ResponseBody Iterable<Scheidsrechter> getAllScheidsrechters(){
        return scheidsrechterRepo.findAll();
    }

    @GetMapping(path="/users/getAll")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepo.findAll();
    }

    @GetMapping(path="/wedstrijden/getAll")
    public @ResponseBody Iterable<Wedstrijd> getAllWedstrijden(){
        return wedstrijdRepo.findAll();
    }

    @GetMapping(path="/begeleidersrollen/getAll")
    public @ResponseBody Iterable<BegeleiderRol> getAllBegeleiderRoller(){
        return begeleiderRolRepo.findAll();
    }

    @DeleteMapping(path="/clearTable")
    public @ResponseBody String clearTable(){

        persoonRepo.deleteAll();
        return "Table Cleared";
    }


}