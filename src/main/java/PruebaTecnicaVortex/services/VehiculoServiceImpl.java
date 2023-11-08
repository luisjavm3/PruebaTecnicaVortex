package PruebaTecnicaVortex.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import PruebaTecnicaVortex.domain.DTOs.VehiculoCreateDTO;
import PruebaTecnicaVortex.domain.DTOs.VehiculoDTO;
import PruebaTecnicaVortex.domain.entities.Vehiculo;
import PruebaTecnicaVortex.repositories.VehiculoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehiculoServiceImpl implements VehiculoService {
	private final VehiculoRepository repository;
	private final ModelMapper mapper;

	@Override
	public VehiculoDTO createVehiculo(VehiculoCreateDTO request) {
		var vehicle = mapper.map(request, Vehiculo.class);
		repository.save(vehicle);
		return mapper.map(vehicle, VehiculoDTO.class);
	}

}
