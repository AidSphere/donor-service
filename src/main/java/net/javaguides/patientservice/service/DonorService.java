package net.javaguides.patientservice.service;

import net.javaguides.patientservice.model.Donor;
import net.javaguides.patientservice.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorService {

    @Autowired
    DonorRepository donorRepository;

    public Donor registerDonor(Donor donor) {
        return donorRepository.save(donor);
    }
}
