package PruebaTecnicaVortex.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import PruebaTecnicaVortex.domain.DTOs.ConductorCreateDTO;
import PruebaTecnicaVortex.domain.DTOs.ConductorDTO;
import PruebaTecnicaVortex.domain.entities.Conductor;
import PruebaTecnicaVortex.repositories.ConductorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConductorServiceImpl implements ConductorService {
	private final ConductorRepository repository;
	private final ModelMapper mapper;

	@Override
	public ConductorDTO createConductor(ConductorCreateDTO conductorCreateDTO) {
		Conductor conductor = mapper.map(conductorCreateDTO, Conductor.class);
		repository.save(conductor);
		return mapper.map(conductor, ConductorDTO.class);
	}

}
