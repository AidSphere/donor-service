package net.javaguides.patientservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Entity
@Table(name="donors")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("fullName")
    @Column(nullable = false)
    private String fullName;

    @JsonProperty("dateOfBirth")
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @JsonProperty("address")
    private String address;

    @JsonProperty("phoneNumber")
    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @JsonProperty("email")
    @Column(nullable = false,unique = true)
    private String email;






}
