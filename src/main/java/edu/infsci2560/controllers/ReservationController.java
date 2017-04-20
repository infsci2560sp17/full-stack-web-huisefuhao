/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Reservation;
import edu.infsci2560.repositories.ReservationRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Neil
 */
@Controller
public class ReservationController {
    @Autowired
    private ReservationRepository repository;
    
    @RequestMapping(value = "reservation", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

    @RequestMapping(value = "reservation/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {        
        return new ModelAndView("reservation", "reservation", repository.findOne(id));
    }
    
    @RequestMapping(value = "reservation/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Reservation reservation, BindingResult result) {
        repository.save(reservation);
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

    @RequestMapping(value = "reservation/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        Reservation reservation = repository.findOne(id);  
        if ( reservation != null ) {
            repository.delete(reservation);
        }
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

    

}