package com.example.petclinic.services;

import com.example.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    VetService findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
