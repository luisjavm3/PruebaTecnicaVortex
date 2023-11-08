package PruebaTecnicaVortex.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import PruebaTecnicaVortex.domain.DTOs.VehiculoCreateDTO;
import PruebaTecnicaVortex.services.VehiculoService;
import PruebaTecnicaVortex.utils.BindingResultUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "vehiculos")
@RequiredArgsConstructor
public class VehiculoController {
	private final VehiculoService service;

	@PostMapping
	public ResponseEntity<?> CreateVehicle(@RequestBody @Valid VehiculoCreateDTO request, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return BindingResultUtils.handleErrorMessages(bindingResult);

		var response = service.createVehiculo(request);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(response.getId())
				.toUri();

		return ResponseEntity.created(location).body(response);

	}
}
