package com.esgi.al.model;

import com.esgi.al.infrastructure.RecruitmentContactId;
import com.esgi.al.model.interview_planning.interview.Profile;

public class RecruitmentContact extends Entity<RecruitmentContactId> {

    private Profile profile;

    protected RecruitmentContact(RecruitmentContactId id) {
        super(new RecruitmentContactId());
    }
}
