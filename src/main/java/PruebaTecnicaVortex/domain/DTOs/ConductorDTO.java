package PruebaTecnicaVortex.domain.DTOs;

import lombok.Data;

@Data
public class ConductorDTO {
	private Integer id;

	private String identificacion;

	private String apellido;

	private String nombre;

	private String telefono;

	private String direccion;
}
