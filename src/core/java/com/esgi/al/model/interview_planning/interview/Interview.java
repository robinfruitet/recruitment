package com.esgi.al.model.interview_planning.interview;

import com.esgi.al.exception.IllegalRecruitmentOfficerException;
import com.esgi.al.exception.RecruitmentOfficerNotAvailable;
import com.esgi.al.infrastructure.InterviewId;
import com.esgi.al.model.Entity;

import java.util.Objects;

public class Interview extends Entity<InterviewId> {

    private TimeSlot timeSlot;

    private Candidate candidate;

    private RecruitmentOfficer recruitmentOfficer;

    public Interview(TimeSlot timeSlot, Candidate candidate, RecruitmentOfficer recruitmentOfficer) {
        super(new InterviewId());

        if (recruitmentOfficer.isAvailable(timeSlot)) {
            throw new RecruitmentOfficerNotAvailable();
        }

        if (!recruitmentOfficer.canInterview(candidate)) {
            throw new IllegalRecruitmentOfficerException();
        }

        this.timeSlot = timeSlot;
        this.candidate = candidate;
        this.recruitmentOfficer = recruitmentOfficer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSlot, candidate, recruitmentOfficer);
    }
}
