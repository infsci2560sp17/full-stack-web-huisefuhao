/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Activity;
import edu.infsci2560.repositories.ActivityRepository;
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
public class ActivityController {
    @Autowired
    private ActivityRepository repository;
    
    @RequestMapping(value = "activity", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("activity", "activity", repository.findAll());
    }

    @RequestMapping(value = "activity/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {        
        return new ModelAndView("activity", "activity", repository.findOne(id));
    }
    
    @RequestMapping(value = "activity/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Activity activity, BindingResult result) {
        repository.save(activity);
        return new ModelAndView("activity", "activity", repository.findAll());
    }

    @RequestMapping(value = "activity/{id}", 
            method = RequestMethod.DELETE, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public ModelAndView delete( @Valid Activity activity, BindingResult result) {
        repository.delete(activity);
        return new ModelAndView("activity", "activity", repository.findAll());
    }

}