package com.esgi.al.infrastructure.repository;

import com.esgi.al.model.sourcing.Prospect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProspectRepository extends JpaRepository<Prospect, Long> {
}
