package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.Travelapp.TravelClass;

import jakarta.transaction.Transactional;


public interface TravellistDao extends JpaRepository<TravelClass, Integer> {
	
	@Query(value="select * from travel_list where id=?1",nativeQuery = true)
	List<TravelClass> listById(int id);
	
	@Modifying
	@Transactional
	@Query(value="update travel_list set description=?2 where id=?1",nativeQuery = true)
	void update(int id,String description);
}