package com.esgi.al.use_cases.sourcing;

import com.esgi.al.infrastructure.repository.FishpondRepository;
import com.esgi.al.infrastructure.repository.ProspectRepository;
import com.esgi.al.model.sourcing.Prospect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Sourcing {

    @Autowired
    private FishpondRepository fishpondRepository;

    @Autowired
    private ProspectRepository prospectRepository;

    @Autowired
    private ContactService contactService;

    public void prospect(ProfileDTO profileDTO) {
        List<Prospect> prospects =
                fishpondRepository.findProfile(profileDTO)
                        .stream()
                        .filter((prospect) -> !prospect.isParticular() || prospect.validateByCTO())
                        .collect(Collectors.toList());

        for (Prospect prospect : prospects) {
            prospectRepository.save(prospect);
            contactService.contactProspect(prospect);
        }
    }
}
