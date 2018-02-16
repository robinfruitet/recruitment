package com.esgi.al.use_cases.interview_planning;

import com.esgi.al.infrastructure.CandidateId;
import com.esgi.al.infrastructure.RecruitmentOfficierId;
import com.esgi.al.infrastructure.repository.InterviewRepository;
import com.esgi.al.model.RecruitmentContact;
import com.esgi.al.model.interview_planning.interview.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetupInterview {

    @Autowired
    private InterviewRepository interviewRepository;

    public void prepareInterview(CandidateDTO candidate, RecruitmentOfficerDTO recruitmentOfficer, TimeSlotDTO timeSlotDTO) {
        Interview interview = new Interview(null, null ,null);
        interviewRepository.save(interview);
    }
}
