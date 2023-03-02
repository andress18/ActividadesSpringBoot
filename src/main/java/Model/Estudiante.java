package Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;
import lombok.NoArgsConstructor;

// @Setter
// @Getter
@Data
@NoArgsConstructor
// @AllArgsConstructor
@Entity
@Table(name = "aca_estudiantes")
public class Estudiante {
    // Crear entidades nombre y materia
    @Id
    private long codigo;
    private String cedula;
    private String nombre;
    private String apellido;
}
