package com.guitar.db.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Manufacturer;

@Repository // Not necessary cause its a Spring Data Repository
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
	
	List<Manufacturer> findByFoundedDateBefore(Date date);
	
	List<Manufacturer> findByActiveTrue();
	
	List<Manufacturer> findByActiveFalse();
	
	List<Manufacturer> getAllThatSellAcoustics(String name);

}
