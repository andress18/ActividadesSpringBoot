package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Materia;
import Repository.MateriaRepository;

@RestController
public class MateriaController {
    @Autowired
    private MateriaRepository materiaReository;

    @GetMapping(value = "/")
    public String mensaje() {
        return "Welcome";
    }

    @GetMapping(value = "/materias")
    public List<Materia> getMaterias() {
        return materiaReository.findAll();
    }

    @PutMapping(value = "/saveMateria")
    public String saveMaterias(@RequestBody Materia materia) {
        materiaReository.save(materia);
        return "Guardado correctemente";
    }

    @PatchMapping(value = "/updateMateria")
    public String updateMaterias(@RequestBody Materia materia) {
        // encontrar materia
        materiaReository.save(materia);
        return "Actualizado correctamente";
    }

    @DeleteMapping(value = "/deleteMateria")
    public String deleteMaterias(@RequestBody long idMateria) {
        // encontrar materia
        materiaReository.deleteById(idMateria);
        return "Removido correctamente";
    }

}
