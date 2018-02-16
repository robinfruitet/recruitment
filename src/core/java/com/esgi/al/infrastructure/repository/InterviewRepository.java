package com.esgi.al.infrastructure.repository;

import com.esgi.al.infrastructure.InterviewId;
import com.esgi.al.infrastructure.RoomId;
import com.esgi.al.model.interview_planning.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class InterviewRepository implements JpaRepository<Interview, Long> {

    public abstract void cancel(InterviewId interviewId);
}
