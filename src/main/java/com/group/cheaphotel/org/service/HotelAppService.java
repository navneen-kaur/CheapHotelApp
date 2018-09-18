package com.group.cheaphotel.org.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.cheaphotel.org.domain.HotelResponse;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface HotelAppService {

    HotelResponse getLowCostHotel(@NotNull @Valid String airport,@NotNull @Valid String date) throws Exception;
}
