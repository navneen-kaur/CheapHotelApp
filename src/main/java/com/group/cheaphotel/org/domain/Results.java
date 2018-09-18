
package com.group.cheaphotel.org.domain;

import apple.laf.JRSUIUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.ArrayList;

@Data
public class Results {


    private String property_name;
    private Address address;
    private Price total_price;
    private ArrayList<ConDetails> contacts;
    @JsonIgnore
    private Loc location;
    @JsonIgnore
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


}
