package com.ibm.poc.service;



import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ibm.poc.dto.ConversionFactorDTO;
import com.ibm.poc.entity.ConversionFactorEntity;
import com.ibm.poc.repository.ConversionFactorRepository;


@Service
public class ConversionFactorServiceImpl implements ConversionFactorService {

	ConversionFactorRepository repo;

	@Autowired
	public ConversionFactorServiceImpl(ConversionFactorRepository repo) {

		this.repo = repo;
	}

	@Override
	public ConversionFactorDTO addConversionFactor(ConversionFactorDTO factordto) {
		// TODO Auto-generated method stub

		// factordto.setId(UUID.randomUUID().toString());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ConversionFactorEntity entity = mapper.map(factordto, ConversionFactorEntity.class);
		repo.save(entity);

		ConversionFactorDTO dto = mapper.map(entity, ConversionFactorDTO.class);
		return dto;
	}

	@Override
	public ConversionFactorDTO updateConversionFactor(ConversionFactorDTO factordto) {
		// TODO Auto-generated method stub

		// factordto.setId(UUID.randomUUID().toString());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ConversionFactorEntity entity = mapper.map(factordto, ConversionFactorEntity.class);
		repo.save(entity);
		ConversionFactorDTO dto = mapper.map(entity, ConversionFactorDTO.class);
		return dto;
	}

	@Override
	public ConversionFactorDTO getfactorBycountrycode(String countrycode) {

		ConversionFactorEntity entity = repo.findByCountryCode(countrycode);
		// if(userEntity == null) throw new UsernameNotFoundException("User not found");

		ConversionFactorDTO dto = new ModelMapper().map(entity, ConversionFactorDTO.class);

		return dto;
	}

}
