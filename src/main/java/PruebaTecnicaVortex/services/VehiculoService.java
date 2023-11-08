package PruebaTecnicaVortex.services;

import PruebaTecnicaVortex.domain.DTOs.VehiculoCreateDTO;
import PruebaTecnicaVortex.domain.DTOs.VehiculoDTO;

public interface VehiculoService {
	VehiculoDTO createVehiculo(VehiculoCreateDTO request);
}
