package com.group.cheaphotel.org.service;



import com.group.cheaphotel.org.domain.*;
import com.group.cheaphotel.org.tranform.ResponseTransform;
import org.apache.tomcat.websocket.Transformation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class HotelAppServiceImpl implements HotelAppService {


    public static final String URL = "https://api.sandbox.amadeus.com/v1.2/hotels/search-airport?apikey=yuPGXGIaBea8XigqJMYJrh4gGd5AdtRP&location=";

    public HotelResponse getLowCostHotel(@NotNull @Valid String airport ,@NotNull @Valid String date) throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON_UTF8}));
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON_UTF8);
        HttpEntity<HotelResponse> entity = new HttpEntity<HotelResponse>(headers);

        RestTemplate restTemplate = new RestTemplate();
        LocalDate fromDate =  LocalDate.parse(date);
        LocalDate incrementedDate = fromDate.plusDays(1);
        ResponseEntity<HotelResponse> response = restTemplate.exchange(URL + airport+"&check_in="+date+"&check_out="+incrementedDate, HttpMethod.GET, entity, HotelResponse.class);
        HotelResponse actualResponse = response.getBody();


          HotelResponse filteredThreeResults = ResponseTransform.manageThreeHotelsResult(actualResponse);

       return ResponseTransform.filterHotelPhoneNum(actualResponse);

    }
}
