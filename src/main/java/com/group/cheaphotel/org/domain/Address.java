package com.group.cheaphotel.org.domain;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
public class Address {

    private String line1;
    private String city;
    private String region;
    private String postal_code;
    private String country;

}
