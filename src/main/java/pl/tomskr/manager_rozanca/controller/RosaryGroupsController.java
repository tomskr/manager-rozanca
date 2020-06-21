package pl.tomskr.manager_rozanca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.manager_rozanca.model.RosaryGroups;

import java.util.Arrays;
import java.util.List;

@RestController
public class RosaryGroupsController {

    @RequestMapping("/groups")
    public List<RosaryGroups> getAllRosaryGroups(){

        return Arrays.asList(
                new RosaryGroups(1,"Matki Bożej"),
                new RosaryGroups(2,"św. Dusza"),
                new RosaryGroups(3,"św. Błażeja")
        );
    }
}
