package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}