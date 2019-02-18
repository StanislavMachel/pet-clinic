package com.example.petclinic.services.map;

import com.example.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp(){
        ownerMapService = new OwnerMapService(new PerTypeMapService(), new PetMapService());

        ownerMapService.save(Owner.builder()
                .id(ownerId)
                .lastName(lastName)
                .build());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Owner owner2 = Owner.builder().id(2L).build();

        Owner savedOwner = ownerMapService.save(owner2);

        Long id = 2L;
        assertEquals(id, savedOwner.getId());

    }

    @Test
    void saveNoId() {
        Owner owner2 = Owner.builder().build();

        Owner savedOwner = ownerMapService.save(owner2);

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }



    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner smith = ownerMapService.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(lastName, smith.getLastName());
    }
}