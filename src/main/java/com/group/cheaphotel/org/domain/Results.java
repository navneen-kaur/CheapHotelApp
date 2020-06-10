
package com.group.cheaphotel.org.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.ArrayList;


public class Results {


    private String property_name;
    @JsonIgnore
    private Address address;
    private Price total_price;
    @JsonIgnore
    private ArrayList<ConDetails> contacts;
    @JsonIgnore
    private Loc location;

    private String property_code;
    @JsonIgnore
    private MinDailyRate min_daily_rate;
    @JsonIgnore
    private ArrayList<Amenities> amenities;
    @JsonIgnore
    private ArrayList<Awards> awards;
    @JsonIgnore
    private ArrayList<Img> images;
    @JsonIgnore
    private ArrayList<Rooms> rooms;


    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Price getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Price total_price) {
        this.total_price = total_price;
    }

    public ArrayList<ConDetails> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<ConDetails> contacts) {
        this.contacts = contacts;
    }

    public Loc getLocation() {
        return location;
    }

    public void setLocation(Loc location) {
        this.location = location;
    }

    public String getProperty_code() {
        return property_code;
    }

    public void setProperty_code(String property_code) {
        this.property_code = property_code;
    }

    public MinDailyRate getMin_daily_rate() {
        return min_daily_rate;
    }

    public void setMin_daily_rate(MinDailyRate min_daily_rate) {
        this.min_daily_rate = min_daily_rate;
    }

    public ArrayList<Amenities> getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList<Amenities> amenities) {
        this.amenities = amenities;
    }

    public ArrayList<Awards> getAwards() {
        return awards;
    }

    public void setAwards(ArrayList<Awards> awards) {
        this.awards = awards;
    }

    public ArrayList<Img> getImages() {
        return images;
    }

    public void setImages(ArrayList<Img> images) {
        this.images = images;
    }

    public ArrayList<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Rooms> rooms) {
        this.rooms = rooms;
    }
}
