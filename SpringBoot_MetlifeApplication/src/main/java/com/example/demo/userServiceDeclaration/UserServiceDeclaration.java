package com.example.demo.userServiceDeclaration;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.MetlifeUserProfiles;

@Repository
public interface UserServiceDeclaration {
	public MetlifeUserProfiles saveUserProfiles(MetlifeUserProfiles metlifeUserProfiles);

	public List<MetlifeUserProfiles> searchByPosition(String Position);

	public List<MetlifeUserProfiles> searchByLocation(String location);

	public List<MetlifeUserProfiles> getAllUserProfiles();

}
