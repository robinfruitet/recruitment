package com.esgi.al.model.interview_planning;

import com.esgi.al.infrastructure.CandidateId;
import com.esgi.al.model.Entity;

public class Candidate extends Entity<CandidateId> {

    private Profile profile;


    protected Candidate() {
        super(new CandidateId());

    }

    public void sendMessageToCandidate() {

    }
}
