package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository // Not necessary cause its a Spring Data Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
  List<Location> findByStateLike(String stateName);
  
 Location findFirstByStateIgnoreCaseStartingWith(String stateName);
  
  List<Location> findByStateNotLikeOrderByStateAsc(String stateName);
  
  List<Location> findByStateOrCountry(String value,String value2);
  
  List<Location> findByStateAndCountry(String state,String country);
  

  
  
	  
  
}
