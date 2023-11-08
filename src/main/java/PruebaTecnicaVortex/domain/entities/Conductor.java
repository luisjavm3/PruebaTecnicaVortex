package PruebaTecnicaVortex.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "conductores")
@NoArgsConstructor
//@Builder
@AllArgsConstructor
public class Conductor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, length = 11)
	private String identificacion;

	@Column(length = 20)
	private String apellido;

	@Column(nullable = false, length = 20)
	private String nombre;

	@Column(nullable = false, length = 20)
	private String telefono;

	@Column(length = 50)
	private String direccion;

	@OneToMany(mappedBy = "conductor")
	private List<Vehiculo> vehiculos;

	@OneToMany(mappedBy = "conductor")
	private List<Pedido> pedidos;
}
