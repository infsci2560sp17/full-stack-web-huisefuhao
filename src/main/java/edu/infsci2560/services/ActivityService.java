/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.services;

import edu.infsci2560.models.Activity;
import edu.infsci2560.models.Activity.ActivityType;
import edu.infsci2560.repositories.ActivityRepository;
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
@RequestMapping("/public/api/activity")
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Activity>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Activity> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Activity> create(@RequestBody Activity activity) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(activity), headers, HttpStatus.OK);
    }

    /*@RequestMapping(method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    public ResponseEntity<Activity> create(@RequestBody Activity activity) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(activity), headers, HttpStatus.OK);
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Reservation> delete(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.delete(id), headers, HttpStatus.OK);
    }
    

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Activity> delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public void update(@RequestBody Activity activity, @PathVariable("id") long id) throws IOException {
        if (id != activity.getId()) {
            repository.delete(id);
        }
        repository.save(activity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        repository.delete(id);
    }
}
