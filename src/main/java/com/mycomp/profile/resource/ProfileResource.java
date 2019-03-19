package com.mycomp.profile.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.profile.model.Profile;
import com.mycomp.profile.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileResource {

	@Autowired
	ProfileService profileServ;
	
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
	    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
	
	
	/** Register Profile */
	@PostMapping(path = "/", produces = "application/json", consumes = "application/json")
	public String registerProfile(@RequestBody Profile profile) {
		
		if(profile != null) {
			return profileServ.register(profile);
		}
		else {
			return "Profile is null";
		}
	}

	/** Get Profile Information */
	@GetMapping(path = "/{profileId}", produces = "application/json")
	public Profile getProfile(@PathVariable String profileId) {
		System.out.println("get profile " + profileId);
		return new Profile();
	}
	/** Update Profile Information */
	@PutMapping(path = "/{profileId}", produces = "application/json", consumes = "application/json")
	public Profile updateProfile(@RequestBody Profile profile) {
		return new Profile();
	}
	
	/** List All Profile */

}
