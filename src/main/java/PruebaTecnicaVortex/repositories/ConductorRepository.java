package PruebaTecnicaVortex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import PruebaTecnicaVortex.domain.entities.Conductor;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Integer> {

}
