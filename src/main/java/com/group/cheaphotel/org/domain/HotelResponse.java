package com.group.cheaphotel.org.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@Data
@JsonIgnoreProperties
public class HotelResponse
{


    private ArrayList<Results> results;


}
