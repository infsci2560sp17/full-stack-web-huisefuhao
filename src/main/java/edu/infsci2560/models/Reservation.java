/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author Neil
 */

@Entity
public class Reservation {

    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String date;
    protected String tel;
    protected long nights;
    protected String room;
    protected String name;
    protected String email;
    protected String message;


    public Reservation() {
        this.id = Long.MAX_VALUE;
        this.tel =null;
        this.date = null;
        this.room = null;
        this.nights = 1L;
        this.name = null;
        this.email = null;
        this.message = null;
    }

    public Reservation(Long id, String room, String name, String tel, String email, String date, Long nights, String message) {
        this.id = id;
        this.date = date;
        this.tel = tel;
        this.room = room;
        this.nights = nights;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", room=" + this.room +", date=" + this.date +", telphone=" + this.tel+ ", nights=" + this.nights +  ", name=" + this.name + ", email=" + this.email +", message=" + this.message +" ]";
    }


    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }


     /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the name
     */
    public String getDate() {
        return date;
    }

    /**
     * @param title the name to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param title the name to set
     */
    public void setRoom(String room) {
        this.room = room;
    }


    /**
     * @return the activityType
     */
    public long getNights() {
        return nights;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setNights(long nights) {
        this.nights = nights;
    }

   
    /**
     * @return the price
     */
    public String getName() {
        return name;
    }

    /**
     * @param price to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param size to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the size
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param size to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}