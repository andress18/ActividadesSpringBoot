package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Estudiante;

@RestController
@RequestMapping("estudiante/v1")
public class EstudianteController {

    @Autowired
    private Repository.EstudianteRepository EstudianteRepository;
    
    @GetMapping(value = "/estudiantes")
    public List<Estudiante> getEstudiantes() {
        return EstudianteRepository.findAll();
    }

    @PutMapping(value = "/saveEstudiante")
    public String saveEstudiante(@RequestBody Estudiante Estudiante) {
        EstudianteRepository.save(Estudiante);
        return "Grabó OK";

    }

    @PatchMapping(value = "/updateEstudiante")
    public String updateEstudiantes(@RequestBody Estudiante Estudiante) {
        // encontrar Estudiante
        // EstudianteReository.(Estudiante);
        return "Update";
    }
    
    @DeleteMapping(value = "/deleteEstudiante")
    public String deleteEstudiantes(@RequestBody long idEstudiante) {
        // encontrar Estudiante
        EstudianteRepository.deleteById(idEstudiante);
        return "Deleted";
    }
}