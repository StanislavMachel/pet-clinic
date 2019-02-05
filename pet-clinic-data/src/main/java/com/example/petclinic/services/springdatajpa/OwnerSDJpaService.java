package com.example.petclinic.services.springdatajpa;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.repositories.PetTypeRepository;
import com.example.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerSDJpaService implements OwnerService {

  private final OwnerRepository ownerRepository;
  private final PetRepository petRepository;
  private final PetTypeRepository petTypeRepository;


  public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
    this.ownerRepository = ownerRepository;
    this.petRepository = petRepository;
    this.petTypeRepository = petTypeRepository;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }

  @Override
  public Owner findById(Long aLong) {
    return null;
  }

  @Override
  public Owner save(Owner object) {
    return null;
  }

  @Override
  public Set<Owner> findAll() {
    return null;
  }

  @Override
  public void delete(Owner object) {

  }

  @Override
  public void deleteById(Long aLong) {

  }
}
