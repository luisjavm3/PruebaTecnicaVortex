package PruebaTecnicaVortex.services;

import PruebaTecnicaVortex.domain.DTOs.ConductorCreateDTO;
import PruebaTecnicaVortex.domain.DTOs.ConductorDTO;

public interface ConductorService {
	ConductorDTO createConductor(ConductorCreateDTO conductorCreateDTO);
}
