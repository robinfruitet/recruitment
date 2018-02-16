package com.esgi.al.infrastructure.repository;

import com.esgi.al.model.sourcing.Prospect;
import com.esgi.al.use_cases.sourcing.ProfileDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishpondRepository extends JpaRepository<Long ,Long> {

    List<Prospect> findProfile(ProfileDTO profileDTO);
}
