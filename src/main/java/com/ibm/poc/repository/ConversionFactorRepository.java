package com.ibm.poc.repository;

import org.springframework.data.repository.CrudRepository;


import com.ibm.poc.entity.ConversionFactorEntity;

public interface ConversionFactorRepository extends CrudRepository<ConversionFactorEntity, Long> {

	// ConversionFactorEntity findById(String Id);
	ConversionFactorEntity findByCountryCode(String countrycode);
}
