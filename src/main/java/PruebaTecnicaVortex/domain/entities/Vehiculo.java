package PruebaTecnicaVortex.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "vehiculos")
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, length = 20)
	private String modelo;

	@Column(nullable = false, length = 20)
	private String placa;

	@Column(nullable = false, length = 20)
	private String capacidad;

	@ManyToOne
	@JoinColumn(name = "conductor_id")
	private Conductor conductor;
}
