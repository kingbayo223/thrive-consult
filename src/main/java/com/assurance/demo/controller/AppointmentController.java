package com.assurance.demo.controller;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.assurance.demo.model.AppointmentModel;

import com.assurance.demo.services.AppointmentServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
	
	@Autowired
	private AppointmentServices repo;
	
	
	@PostMapping("/api/appoint")
	@Transactional
	@CrossOrigin
	public String saveAddItems(@RequestBody AppointmentModel appointmentModel) {
	    repo.save(appointmentModel);
	     
	    return "Hi" +appointmentModel.getfName()+ "Registration is successful";
	
	}
	@GetMapping("/api/all-appointments")
	@CrossOrigin
	public Iterable<AppointmentModel> showAllAppointmentModel(){
		return repo.listAll();
		
	}
	
	
	@GetMapping("/api/Invest")
	@CrossOrigin
	public List<AppointmentModel> findAll(
		@PathVariable(value="service") String service){
		
		return repo.findAll(service);
		
	}


	//@GetMapping("/api/all-services")
	//@CrossOrigin
	//public Iterable<Services> showAllSrevices(){
		//return rep.listAll();
		
	}
//}
