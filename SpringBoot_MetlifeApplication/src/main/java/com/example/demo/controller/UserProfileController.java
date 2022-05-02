package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MetlifeUserProfiles;
import com.example.demo.userServiceDeclaration.UserServiceDeclaration;

@RestController
@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RequestMapping("/UserProfiles")
public class UserProfileController {
	@Autowired
	private UserServiceDeclaration userServiceDeclaration;

	@PostMapping("/saveUser")
	public ResponseEntity<MetlifeUserProfiles> saveUser(@RequestBody MetlifeUserProfiles metlifeUserProfiles) {
		return new ResponseEntity<>(userServiceDeclaration.saveUserProfiles(metlifeUserProfiles), HttpStatus.OK);
	}

	@GetMapping("/searchByPosition/{position}")
	public List<MetlifeUserProfiles> searchByPosition(@PathVariable(name = "position") String position) {
		return userServiceDeclaration.searchByPosition(position);
	}

	@GetMapping("/searchByLocation/{location}")
	public List<MetlifeUserProfiles> searchByLocation(@PathVariable(name = "location") String location) {
		return userServiceDeclaration.searchByLocation(location);
	}

	@GetMapping("/getAllUserProfiles")
	public List<MetlifeUserProfiles> getAllUserProfiles() {
		return userServiceDeclaration.getAllUserProfiles();

	}

}
