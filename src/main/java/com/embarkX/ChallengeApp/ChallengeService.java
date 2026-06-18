package com.embarkX.ChallengeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeService() {
        Challenge challenge1 = new Challenge(1L, "January", "Learn a new Language");
        challenges.add(challenge1);
        Challenge challenge2 = new Challenge(2L, "February", "Learn a new skill");
        challenges.add(challenge2);
    }

    public List<Challenge> getAllChallenges() {
        return challenges;
    }

    public boolean addChallenges(Challenge challenge) {
        if (challenge != null) {
            challenges.add(challenge);
            return true;
        } else {
            return false;
        }
    }

    public Challenge getAChallenge(String month){
    for(Challenge challenge:challenges){
        if(challenge.getMonth().equals(month)){
            return challenge;
        }
    }
    return null;
    }

    public boolean updateChallenge(Long id, Challenge updatedChallenge) {
        for(Challenge challenge:challenges){
            if(challenge.getId().equals(id)){
                challenge.setMonth("March");
                challenge.setDescription("Time to play");
                return  true;
            }
        }
        return  false;
    }

    public boolean deleteChallenge(Long id) {
        return challenges.removeIf(challenge -> challenge.getId().equals(id));

    }
}
