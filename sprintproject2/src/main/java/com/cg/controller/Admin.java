package com.cg.Admin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import com.cap.anurag.entity.User;
import com.cg.sprint.entity.Account;
import com.cg.sprint.entity.City;
import com.cg.sprint.entity.Customer;

import com.cg.sprint.entity.Seats;

import com.cg.sprint.entity.Theatre;
import com.cg.sprint.exceptions.AccountNotFoundException;
import com.cg.sprint.service.AdminServiceInterface;

@RestController
//@CrossOrigin("http://localhost:4200")
public class Admin {	
	@Autowired
	private AdminServiceInterface adminservice;
	
	@PostMapping("/addcity")
    public City addCity(@Valid @RequestBody City c)
    {
   	 return adminservice.save(c);
   	
    }
	@PostMapping("/addtheatre")
    public Theatre addTheatre(@Valid @RequestBody Theatre t)
    {
   	 return adminservice.save(t);
   	
    }
	
	

	@PutMapping("/update_cities")
	public String updateCity(@RequestBody City c) {
		String string = adminservice.updateCity(c);
		return string;
	}
	@PutMapping("/update_theatres")
	public String updateTheatre(@RequestBody Theatre t) {
		String string = adminservice.updateTheatre(t);
		return string;
	}
	
	@DeleteMapping("/removeCity/{sno}")
    public String removeCity(@PathVariable int sno)
    {
   	 adminservice.removeCity(sno);
   	 return "City Details Removed";
    }
	@DeleteMapping("/removeTheatre/{theatre_id}")
    public String removeTheatre(@PathVariable int theatre_id)
    {
   	 adminservice.removeTheatre(theatre_id);
   	 return "Theatre Details Removed";
    }
	
	@DeleteMapping("/removeShow/{sno}")
    public String removeShow(@PathVariable int sno)
    {
   	 adminservice.removeShow(sno);
   	 return "Show Details Removed";
    }
	}