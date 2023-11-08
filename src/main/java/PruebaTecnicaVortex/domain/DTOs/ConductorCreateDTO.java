package PruebaTecnicaVortex.domain.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ConductorCreateDTO {
	@NotBlank(message = "La identificación no debe ser nula o vacía.")
	@Size(max = 11, message = "La longitud de la identificación no debe ser mayor a 11")
	private String identificacion;

	@Size(min = 2, message = "La longitud del apellido no debe ser menor a 2")
	@Size(max = 20, message = "La longitud del apellido no debe ser mayor a 20")
	private String apellido;

	@NotBlank(message = "El nombre no debe ser nulo o vacío.")
	@Size(min = 2, message = "La longitud del nombre no debe ser menor a 2")
	@Size(max = 20, message = "La longitud del nombre no debe ser mayor a 20")
	private String nombre;

	@NotBlank(message = "El telefono no debe ser nulo o vacío.")
	@Size(max = 20, message = "La longitud del telefono no debe ser mayor a 20")
	private String telefono;

	@Size(max = 50, message = "La longitud de la dirección no debe ser mayor a 50")
	private String direccion;
}
