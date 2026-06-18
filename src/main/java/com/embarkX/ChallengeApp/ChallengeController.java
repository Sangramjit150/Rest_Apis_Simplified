package com.embarkX.ChallengeApp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;


@RestController

public class ChallengeController {

  private  ChallengeService challengeService;
    public ChallengeController(ChallengeService challengeService){
        this.challengeService=challengeService;

    }
    @GetMapping("/challenges")
    public ResponseEntity <List<Challenge>>getAllChallenges(){

        return new ResponseEntity<>(challengeService.getAllChallenges(),HttpStatus.OK);
    }

    @PostMapping("/challenges")
public ResponseEntity <String> addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded= challengeService.addChallenges(challenge);
        if(isChallengeAdded){
            return new ResponseEntity<>("Challenge was added successfully", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Challenge was not added successfully",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/myname")
    private String myName(){
        return "Sangramjit";
    }

    @GetMapping("/challenges/{month}")
    public  Challenge getAChallenge(@PathVariable String month){

        return challengeService.getAChallenge(month);
    }

    @PutMapping("/challenges/{id}")
    public ResponseEntity<String>updateChallenge(@PathVariable Long id,@RequestBody Challenge updatedChallenge){
        boolean isChallengeUpdated=challengeService.updateChallenge(id,updatedChallenge);
        if(isChallengeUpdated==true){
            return new ResponseEntity<>("Challenge was updated successfully", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Challenge was not updated successfully",HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("/challenges/{id}")
    public ResponseEntity<String>deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted=challengeService.deleteChallenge(id);
        if(isChallengeDeleted==true){
            return new ResponseEntity<>("Challenge was deleted successfully", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Challenge was not deleted successfully",HttpStatus.NOT_FOUND);
    }

}
