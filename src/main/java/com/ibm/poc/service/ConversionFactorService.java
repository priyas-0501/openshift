package com.ibm.poc.service;

import com.ibm.poc.dto.ConversionFactorDTO;

public interface ConversionFactorService {

	ConversionFactorDTO addConversionFactor(ConversionFactorDTO factordto);

	ConversionFactorDTO updateConversionFactor(ConversionFactorDTO factordto);

	ConversionFactorDTO getfactorBycountrycode(String countrycode);
}
