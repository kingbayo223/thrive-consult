package com.assurance.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assurance.demo.model.AppointmentModel;


@Repository
public interface AppointmentRepo extends JpaRepository<AppointmentModel, Integer>{

}
