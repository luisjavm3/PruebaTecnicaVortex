package PruebaTecnicaVortex.domain.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class VehiculoCreateDTO {
//	@Column(nullable = false, length = 20)
	@NotBlank(message = "El modelo no debe ser nulo o vacío.")
	@Size(max = 20, message = "La longitud del modelo no debe ser mayor a 20")
	private String modelo;

//	@Column(nullable = false, length = 20)
	@NotBlank(message = "La placa no debe ser nula o vacía.")
	@Size(max = 20, message = "La longitud de la placa no debe ser mayor a 20")
	private String placa;

//	@Column(nullable = false, length = 20)
	@NotBlank(message = "La capacidad no debe ser nula o vacía.")
	@Size(max = 20, message = "La longitud de la capacidad no debe ser mayor a 20")
	private String capacidad;

	private Integer conductor;
}