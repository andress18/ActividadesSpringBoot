package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
