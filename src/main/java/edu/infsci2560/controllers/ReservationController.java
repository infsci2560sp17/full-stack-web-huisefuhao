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
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @RequestMapping(value = "reservation/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Reservation reservation, BindingResult result) {
        repository.save(reservation);
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

    @RequestMapping(value = "reservation/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value = "id", required=true) Long id) {
        Reservation reservation = repository.findOne(id);
        
        if (room != null) {
            repository.delete(id);
        }

        return new ModelAndView("reservation", "reservation", repository.findAll());
    }
    
    @RequestMapping(value = "/reservation/put", method = RequestMethod.PUT)
    public ModelAndView update(@RequestParam("id") Long id, @RequestParam("date") String date, @RequestParam("nights") Long nights, @RequestParam("name") String name, @RequestParam("email") String emial) {
        Reservation reservation = repository.findOne(id);
        reservation.setDate(date);
        reservation.setNights(nights);
        reservation.setName(name);
        reservation.setEmail(email);

        return new ModelAndView("reservation", "reservation", repository.findAll());
    }
/*
    @RequestMapping(value = "reservation/update/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update(@ModelAttribute @Valid Reservation reservation, BindingResult result, @PathVariable("id") long id) {
        if (id != room.getId()) {
            repository.delete(id);
        }
        repository.save(reservation);
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

    @RequestMapping(value = "reservation/delete/{id}", method = RequestMethod.DELETE, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView delete(@ModelAttribute @Valid Reservation reservation, BindingResult result, @PathVariable("id") long id) {
        repository.delete(id);
        return new ModelAndView("reservation", "reservation", repository.findAll());
    }

*/
    
}