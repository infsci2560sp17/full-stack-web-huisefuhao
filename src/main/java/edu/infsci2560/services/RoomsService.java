/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.services;

import edu.infsci2560.models.Room;
import edu.infsci2560.models.Room.RoomType;
import edu.infsci2560.models.Room.BedType;
import edu.infsci2560.repositories.RoomRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Neil
 */
@RestController
@RequestMapping("/public/api/rooms")
public class RoomsService {

    @Autowired
    private RoomRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Room>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Room> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Room> create(@RequestBody Room room) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(room), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    public ResponseEntity<Room> update(@RequestBody Room room) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(room), headers, HttpStatus.OK);
    }

    /*@RequestMapping(method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    public ResponseEntity<Room> create(@RequestBody Room room) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(room), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Room> delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }
    */

    /*@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public void update(@RequestBody Room room, @PathVariable("id") long id) throws IOException {
        if (id != room.getId()) {
            repository.delete(id);
        }
        repository.save(room);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        repository.delete(id);
    }
    */
}
