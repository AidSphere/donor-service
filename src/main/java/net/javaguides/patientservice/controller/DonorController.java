package net.javaguides.patientservice.controller;

import net.javaguides.patientservice.model.Donor;
import net.javaguides.patientservice.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/donors")

public class DonorController  {

    @Autowired
    private DonorService donorService;

    @PostMapping("/register")
    public ResponseEntity<Donor> registerDonor(@RequestBody Donor donor) {
        Donor d = donorService.registerDonor(donor);
        return new ResponseEntity<>(d,HttpStatus.CREATED);
    }



}
