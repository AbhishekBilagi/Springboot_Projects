package com.objectmapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;



@Data
@AllArgsConstructor
@Embeddable
public class Address {

	 @JsonProperty("street")
    private String street;
	 @JsonProperty("suite")
    private String suite;
	 @JsonProperty("city")
    private String city;
	 @JsonProperty("zipcode")
    private String zipcode;

    @Embedded
    @JsonProperty("geo")
    private Geo geo;

    public Address() {}
}
