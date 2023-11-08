package PruebaTecnicaVortex.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class BindingResultUtils {
	public static ResponseEntity<?> handleErrorMessages(BindingResult result) {
		Map<String, String> errors = new HashMap<>();

		for (FieldError field : result.getFieldErrors()) {
			errors.put(field.getField(), field.getDefaultMessage());
		}

		return ResponseEntity.badRequest().body(errors);
	}
}
