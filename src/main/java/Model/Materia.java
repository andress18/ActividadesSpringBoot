package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;
import lombok.NoArgsConstructor;

// @Setter
// @Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Materia {
    @Id
    @Column(name = "aca_materias")
    private long codigo;
    @Column(name = "mat_nombre")
    private String nombre;
}
