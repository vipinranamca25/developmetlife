package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MetlifeUserProfiles;

@Repository
public interface UserProfileRepository extends JpaRepository<MetlifeUserProfiles, Integer> {

	
	public List<MetlifeUserProfiles> findByPosition(String position);

	
	public List<MetlifeUserProfiles> findByLocation(String location);

}
