package com.group.cheaphotel.org.controller;


import com.group.cheaphotel.org.domain.HotelResponse;
import com.group.cheaphotel.org.domain.Price;
import com.group.cheaphotel.org.domain.Results;
import com.group.cheaphotel.org.service.HotelAppService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CheapHotelApplicationController {

  private HotelAppService hotelAppService;

  @Autowired
  public CheapHotelApplicationController(final HotelAppService hotelAppService) {
    this.hotelAppService = hotelAppService;
  }

  @GetMapping(value = "/hotels", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @ResponseStatus(HttpStatus.OK)
  public HotelResponse getCheapHotel(@RequestParam("airport") String airport,
      @RequestParam("date") String date) throws Exception {

    Results res = new Results();
    res.setProperty_name("Hotel1");
    res.setTotal_price(new Price("1.00","CAD"));
    res.setProperty_code("123456");
    ArrayList<Results> arrayList = new ArrayList<>();
    arrayList.add(res);
    final HotelResponse hotelResponse = new HotelResponse(arrayList);
    return hotelResponse;
   // return hotelAppService.getLowCostHotel(airport, date);
  }


}