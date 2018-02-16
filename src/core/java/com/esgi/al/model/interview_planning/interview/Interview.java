package com.esgi.al.model.interview_planning.interview;

import com.esgi.al.infrastructure.InterviewId;
import com.esgi.al.infrastructure.repository.RecruitmentOfficerRepository;
import com.esgi.al.model.Entity;
import com.esgi.al.model.interview_planning.TimeSlot;
import com.esgi.al.use_cases.interview_planning.CandidateDTO;
import com.esgi.al.use_cases.interview_planning.TimeSlotDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class Interview extends Entity<InterviewId> {

    private TimeSlot timeSlot;

    private Candidate candidate;

    private RecruitmentOfficer recruitmentOfficer;

    @Autowired
    private RecruitmentOfficerRepository<RecruitmentOfficer> recruitmentOfficerRepository;

    public Interview(CandidateDTO candidateDTO, TimeSlotDTO timeSlotDTO) {
        super(new InterviewId());

        this.candidate = dtoToCandidate(candidateDTO);
        this.timeSlot = dtoToTimeSlot(timeSlotDTO);
        this.recruitmentOfficer = findValidOfficer(this.candidate, this.timeSlot);
    }

    private RecruitmentOfficer findValidOfficer(Candidate candidate, TimeSlot timeSlot) {
        return recruitmentOfficerRepository.findAll()
                .stream()
                .filter((officer) ->
                    officer.canInterview(candidate)
                            && officer.isAvailable(timeSlot))
                .findFirst()
                .get();
    }

    private static TimeSlot dtoToTimeSlot(TimeSlotDTO timeSlot) {
        return new TimeSlot(timeSlot.getStartTime(), timeSlot.getDuration());
    }

    public static Candidate dtoToCandidate(CandidateDTO candidateDTO) {
        Profile profile = new Profile(candidateDTO.getSpecialism(), candidateDTO.getYearExperiences());
        Information information = new Information(candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getEmail());
        return new Candidate(profile, information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSlot, candidate, recruitmentOfficer);
    }
}
