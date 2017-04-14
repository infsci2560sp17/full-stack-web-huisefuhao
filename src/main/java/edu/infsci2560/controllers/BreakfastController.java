/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Breakfast;
import edu.infsci2560.repositories.BreakfastRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Neil
 */
@Controller
public class BreakfastController {
    @Autowired
    private BreakfastRepository repository;
    
    @RequestMapping(value = "breakfast", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("breakfast", "breakfast", repository.findAll());
    }

    @RequestMapping(value = "breakfast/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {        
        return new ModelAndView("breakfast", "breakfast", repository.findOne(id));
    }
    
    @RequestMapping(value = "breakfast/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Breakfast breakfast, BindingResult result) {
        repository.save(breakfast);
        return new ModelAndView("breakfast", "breakfast", repository.findAll());
    }

    @RequestMapping(value = "breakfast/{id}", 
            method = RequestMethod.DELETE, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public ModelAndView delete( @Valid Breakfast breakfast, BindingResult result) {
        repository.delete(breakfast);
        return new ModelAndView("breakfast", "breakfast", repository.findAll());
    }
}