package com.esgi.al.model.interview_planning.interview;

import com.esgi.al.infrastructure.RecruitmentOfficierId;
import com.esgi.al.model.Entity;
import com.esgi.al.model.interview_planning.TimeSlot;

class RecruitmentOfficer extends Entity<RecruitmentOfficierId> {

    private Profile profile;

    private Information information;

    protected RecruitmentOfficer(Profile profile, Information information) {
        super(new RecruitmentOfficierId());

        this.profile = profile;
        this.information = information;
    }

    public boolean canInterview(Candidate candidate) {
        return 0 == profile.compareTo(candidate.getProfile());
    }

    public boolean isAvailable(TimeSlot timeSlot) {
        return true;
    }
}
