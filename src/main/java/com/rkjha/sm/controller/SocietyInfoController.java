package com.rkjha.sm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rkjha.sm.model.SocietyInfoModel;

@RequestMapping(value = "/society/info")
@RestController
public class SocietyInfoController {

	@RequestMapping(method = RequestMethod.GET)
	public SocietyInfoModel getSocietyInfo() {
		SocietyInfoModel society_info = new SocietyInfoModel();
		society_info.setInfoId(1);
		society_info.setRegisteredName("RTB");
		society_info.setAliasName("Alias Name");
		society_info.setCity("Bangalore");
		society_info.setLocality("Munnekolala");
		society_info.setSocietyId(2);
		society_info.setState("Karnatka");
		society_info.setStreet("2nd A Cross");
		return society_info;
	}
}
