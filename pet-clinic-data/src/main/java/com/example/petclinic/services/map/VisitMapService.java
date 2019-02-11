package com.example.petclinic.services.map;

import com.example.petclinic.model.Visit;
import com.example.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
  @Override
  public Visit findById(Long aLong) {
    return super.findById(aLong);
  }

  @Override
  public Visit save(Visit visit) {
    if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
        || visit.getPet().getOwner().getId() == null){
      throw new RuntimeException("Invalid Visit");
    }

    return super.save(visit);
  }

  @Override
  public Set<Visit> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(Visit visit) {
    super.delete(visit);
  }

  @Override
  public void deleteById(Long aLong) {
    super.deleteById(aLong);
  }
}
