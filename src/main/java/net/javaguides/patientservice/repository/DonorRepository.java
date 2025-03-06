package net.javaguides.patientservice.repository;

import net.javaguides.patientservice.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor,Long> {
}
