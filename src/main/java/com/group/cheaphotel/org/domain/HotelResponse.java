package com.group.cheaphotel.org.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;


@JsonIgnoreProperties
public class HotelResponse
{


    private ArrayList<Results> results;

    public HotelResponse(ArrayList<Results> results) {
        this.results = results;
    }


    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }
}
