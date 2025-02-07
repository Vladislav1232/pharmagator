package com.eleks.academy.pharmagator.controllers;

import com.eleks.academy.pharmagator.entities.Pharmacy;
import com.eleks.academy.pharmagator.repositories.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pharmacies")
public class PharmacyController {
    private final PharmacyRepository pharmacyRepository;

    @GetMapping
    public ResponseEntity<List<Pharmacy>> getAll() {
        return ResponseEntity.ok(pharmacyRepository.findAll());
    }
    @GetMapping(value = "/{id}")
    public Optional<Pharmacy> findById(@PathVariable("id") Long id) {
        return  pharmacyRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pharmacy save(Pharmacy pharmacy) {
      return pharmacyRepository.save(pharmacy);
    }


    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(Long id) {
        pharmacyRepository.deleteById(id);
    }
}
