package PruebaTecnicaVortex.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import PruebaTecnicaVortex.domain.DTOs.ConductorCreateDTO;
import PruebaTecnicaVortex.domain.DTOs.ConductorDTO;
import PruebaTecnicaVortex.services.ConductorService;
import PruebaTecnicaVortex.utils.BindingResultUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "conductores")
@RequiredArgsConstructor
public class ConductorController {
	private final ConductorService service;

	@PostMapping
	public ResponseEntity<?> CreateConductor(@RequestBody @Valid ConductorCreateDTO request,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return BindingResultUtils.handleErrorMessages(bindingResult);

		ConductorDTO conductor = service.createConductor(request);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(conductor.getId())
				.toUri();

		return ResponseEntity.created(location).body(conductor);
	}
}
