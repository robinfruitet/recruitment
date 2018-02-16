package com.esgi.al.infrastructure.repository;

import com.esgi.al.model.interview_planning.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class InterviewRepository implements JpaRepository<Interview, Long> {
}
