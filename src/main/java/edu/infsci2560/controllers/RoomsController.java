/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Room;
import edu.infsci2560.models.Room.RoomType;
import edu.infsci2560.models.Room.BedType;
import edu.infsci2560.repositories.RoomRepository;
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
public class RoomsController {
    @Autowired
    private RoomRepository repository;
    
    @RequestMapping(value = "rooms", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("rooms", "rooms", repository.findAll());
    }
    
    @RequestMapping(value = "rooms/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Room room, BindingResult result) {
        repository.save(room);
        return new ModelAndView("rooms", "rooms", repository.findAll());
    }

    @RequestMapping(value = "rooms/delete", method = RequestMethod.GET)
    public ModelAndView deleteRoom(@RequestParam(value = "id", required=true) Long id) {
        Room room = repository.findOne(id);
        
        if (room != null) {
            repository.delete(id);
        }

        return new ModelAndView("rooms", "rooms", repository.findAll());
    }

    /*@RequestMapping(value = "rooms/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value = "id", required=true) Long id) {
        Room room = repository.findOne(id);
        
        if (room != null) {
            repository.delete(id);
        }

        return new ModelAndView("rooms", "rooms", repository.findAll());
    }
    
    @RequestMapping(value = "/rooms/put", method = RequestMethod.PUT)
    public ModelAndView update(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("comment") String comment, @RequestParam("comment") String comment, @RequestParam("comment") String comment, @RequestParam("comment") String comment, @RequestParam("comment") String comment, @RequestParam("comment") String comment, @RequestParam("comment") String comment) {
        Room room = repository.findOne(id);
        room.setComment(comment);

        return new ModelAndView("rooms", "rooms", repository.findAll());
    }
    */



}
