package com.example.demo.userServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MetlifeUserProfiles;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.userServiceDeclaration.UserServiceDeclaration;

@Service
public class UserServiceImpl implements UserServiceDeclaration {
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public MetlifeUserProfiles saveUserProfiles(MetlifeUserProfiles metlifeUserProfiles) {
		MetlifeUserProfiles saveUserProfiles = userProfileRepository.save(metlifeUserProfiles);
		return saveUserProfiles;
	}

	@Override
	public List<MetlifeUserProfiles> searchByPosition(String Position) {

		return userProfileRepository.findByPosition(Position);
	}

	@Override
	public List<MetlifeUserProfiles> searchByLocation(String location) {
		return userProfileRepository.findByLocation(location);
	}

	@Override
	public List<MetlifeUserProfiles> getAllUserProfiles() {
		// TODO Auto-generated method stub
		return userProfileRepository.findAll();
	}

}
