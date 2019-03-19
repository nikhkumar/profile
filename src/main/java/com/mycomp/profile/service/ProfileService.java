package com.mycomp.profile.service;

import org.springframework.stereotype.Service;

import com.mycomp.profile.model.Profile;

@Service
public class ProfileService {

	public String register(Profile profile) {

		int pId = 0;
		
		return "Sucuessfully created profile [" + pId + "]";
	}

}
