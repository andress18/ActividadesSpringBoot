package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "Saved";
    }

}
