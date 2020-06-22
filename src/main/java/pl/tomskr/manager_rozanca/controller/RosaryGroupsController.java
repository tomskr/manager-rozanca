package pl.tomskr.manager_rozanca.controller;

import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(method = RequestMethod.POST, value = "/groups/new")
    public void addRosaryGroup(@RequestBody  RosaryGroups rosaryGroups){
        rosaryGroupService.addRosaryGroup(rosaryGroups);
    }
}
