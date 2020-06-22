package pl.tomskr.manager_rozanca.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.manager_rozanca.model.RosaryGroups;
import pl.tomskr.manager_rozanca.service.RosaryGroupService;
import java.util.List;

@RestController
public class RosaryGroupsController {

    private  RosaryGroupService rosaryGroupService;

    public RosaryGroupsController(RosaryGroupService rosaryGroupService) {
        this.rosaryGroupService = rosaryGroupService;
    }

    @RequestMapping("/groups")
    public List<RosaryGroups> getAllRosaryGroups(){
        return rosaryGroupService.getAllRosaryGroups();
    }

    @RequestMapping("/groups/{id}")
    public RosaryGroups getRosaryGroup(@PathVariable String id){
        return rosaryGroupService.getRosaryGroup(id);
    }

//    public void deleteRosaryGroup(){
//
//    }
}
