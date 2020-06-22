package pl.tomskr.manager_rozanca.service;

import org.springframework.stereotype.Service;
import pl.tomskr.manager_rozanca.model.RosaryGroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RosaryGroupService {

    List<RosaryGroups> rosaryGroupsList = new ArrayList<RosaryGroups>(Arrays.asList(
            new RosaryGroups("1","Matki Bożej"),
            new RosaryGroups("2","św. Dusza"),
            new RosaryGroups("3","św. Błażeja")
        ));

    public List<RosaryGroups> getAllRosaryGroups(){
        return rosaryGroupsList;
    }

    public RosaryGroups getRosaryGroup(String id){
        return rosaryGroupsList.stream().filter(rosaryGroups -> rosaryGroups.getId().equals(id)) .findFirst().get();
    }

    public void addRosaryGroup(RosaryGroups rosaryGroups){
        rosaryGroupsList.add(rosaryGroups);
    }

}
