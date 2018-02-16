package com.esgi.al.model.interview_planning.interview;

import com.esgi.al.infrastructure.CandidateId;
import com.esgi.al.model.Entity;

class Candidate extends Entity<CandidateId> {

    private Profile profile;

    private Information information;

    protected Candidate(Profile profile, Information information) {
        super(new CandidateId());
        this.profile = profile;
        this.information = information;
    }

    public Profile getProfile() {
        return profile;
    }

    public Information getInformation() {
        return information;
    }
}
