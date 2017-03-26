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
public class Activity {

    private static final long serialVersionUID = 1L;

    public enum ActivityType {
        Unknown,
        Indoor,
        Outdoor,
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected ActivityType activityType;
    protected String description;
    protected String time;
    protected String location;


    public Activity() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.activityType = ActivityType.Unknown;
        this.description = null;
        this.time = null;
        this.location = null;
    }

    public Activity(Long id, String name, ActivityType activityType, String description, String time, String location) {
        this.id = id;
        this.name = name;
        this.activityType = activityType;
        this.description = description;
        this.time = time;
        this.location = location;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", activityType=" + this.activityType +  ", description=" + this.description + ", time=" + this.time + ", location=" + this.location +" ]";
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param title the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the activityType
     */
    public ActivityType getActivityType() {
        return activityType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
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
     * @return the price
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param price to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the size
     */
    public String getTime() {
        return time;
    }

    /**
     * @param size to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the maxOccupancy
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param maxOccupancy to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
}