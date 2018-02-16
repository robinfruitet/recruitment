package com.esgi.al.infrastructure.repository;

import com.esgi.al.infrastructure.InterviewId;
import com.esgi.al.model.interview_planning.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {

    void cancel(InterviewId interviewId);
}
