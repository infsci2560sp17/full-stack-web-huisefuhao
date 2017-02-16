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
public class Room {

    private static final long serialVersionUID = 1L;

    public enum RoomType {
        Unknown,Twin Bed Room,Double Queen Room,Queen Size Room,King Size Room,Suite;
    }
    
    public enum BedType {
        Unknown,Twin,Queen,King
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected RoomType roomType;
    protected Long price;
    protected Long size;
    protected Long maxOccupancy;
    protected Long bedNumber;
    protected BedType bedType;

    public Room() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.roomType = RoomType.Unknown;
        this.price = Long.MAX_VALUE;
        this.size = Long.MAX_VALUE;
        this.maxOccupancy = Long.MAX_VALUE;
        this.bedNumber = Long.MAX_VALUE;
        this.bedType = BedType.Unknown;
    }

    public Room(Long id, String name, RoomType roomType, Long price, Long size, Long maxOcuupancy, Long bedNumber, BedType bedType) {
        this.id = id;
        this.name = name;
        this.roomType = eoomType;
        this.price = price;
        this.size = size;
        this.maxOccupancy = maxOccupancy;
        this.bedNumber = bedNumber;
        this.bedType = bedType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", roomType=" + this.roomType +  ", price=" + this.price + ", size=" + this.size + ", maxOccupancy=" + this.maxOccupancy + ", bedNumber=" + this.bedNumber + ", bedType=" + this.bedType +" ]";
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
     * @return the workoutType
     */
    public WorkoutType getRoomType() {
        return roomType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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
    public String getPrice() {
        return price;
    }

    /**
     * @param price to set
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size to set
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return the maxOccupancy
     */
    public Long getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * @param maxOccupancy to set
     */
    public void setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
    
    /** 
     * @return the BedType
     */
    public WorkoutType getBedType() {
       return bedType;
    }

    /**
     * @param bedType the BedType to set
     */
    public void setRoomType(BedType bedType) {
       this.bedType = bedType;
    }

}
