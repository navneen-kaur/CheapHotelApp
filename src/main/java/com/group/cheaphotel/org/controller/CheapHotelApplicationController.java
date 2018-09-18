package com.group.cheaphotel.org.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.cheaphotel.org.domain.HotelResponse;
import com.group.cheaphotel.org.service.HotelAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class CheapHotelApplicationController {

    private HotelAppService hotelAppService;

    @Autowired
    public CheapHotelApplicationController(final HotelAppService hotelAppService){
        this.hotelAppService = hotelAppService;
    }

    @GetMapping(value="/hotels",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public HotelResponse getCheapHotel(@RequestParam("airport")String airport,@RequestParam("date")String date) throws Exception {
        return hotelAppService.getLowCostHotel(airport, date);
    }



}