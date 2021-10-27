package com.assurance.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assurance.demo.model.AppointmentModel;

import com.assurance.demo.repository.AppointmentRepo;


@Service
public class AppointmentServices {
	

	@Autowired
	private AppointmentRepo repo;
	
	
	 public List<AppointmentModel> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(AppointmentModel add) {
	        repo.save(add);
	    }
	     
	    public AppointmentModel get(int id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(int id) {
	        repo.deleteById(id);
	    }

	    public List< AppointmentModel> findAll() {
			// TODO Auto-generated method stub
			return  repo.findAll();
		}

		public List<AppointmentModel> findAll(String service) {
			// TODO Auto-generated method stub
			return null;
		}
		
	  
			

}
