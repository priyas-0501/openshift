package com.ibm.poc.dto;

import java.io.Serializable;

public class ConversionFactorDTO implements Serializable {
	
	private static final long serialVersionUID = 4807379143383297660L;
	private String countryCode;
	private double countryfactor;
	private String Id;

	public ConversionFactorDTO() {

	}

	public ConversionFactorDTO(String countryCode, double countryfactor) {
		super();
		this.countryCode = countryCode;
		this.countryfactor = countryfactor;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getCountryfactor() {
		return countryfactor;
	}

	public void setCountryfactor(double countryfactor) {
		this.countryfactor = countryfactor;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

}
