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
public class Breakfast {

    private static final long serialVersionUID = 1L;

    public enum BreakfastType {
        Unknown,
        AmericanStyle,
        ChineseStyle,
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected BreakfastType breakfastType;
    protected String description;
    protected String food;
    protected String beverage;


    public Breakfast() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.breakfastType = BreakfastType.Unknown;
        this.description = null;
        this.food = null;
        this.beverage = null;
    }

    public Breakfast(Long id, String name, BreakfastType breakfastType, String description, String food, String beverage) {
        this.id = id;
        this.name = name;
        this.breakfastType = breakfastType;
        this.description = description;
        this.food = food;
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", breakfastType=" + this.breakfastType +  ", description=" + this.description + ", food=" + this.food + ", beverage=" + this.beverage +" ]";
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
    public BreakfastType getBreakfastType() {
        return breakfastType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setBreakfastType(BreakfastType breakfastType) {
        this.breakfastType = breakfastType;
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
    public String getFood() {
        return food;
    }

    /**
     * @param size to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the maxOccupancy
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * @param maxOccupancy to set
     */
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
}