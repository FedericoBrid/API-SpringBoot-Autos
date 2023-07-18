package com.apiCurso.apiCurso.controllers;

import com.apiCurso.apiCurso.models.Autos;
import com.apiCurso.apiCurso.services.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/autos")
public class AutoRestController {
    private AutosService autosService;

    @Autowired
    public AutoRestController(AutosService autosService) {
        this.autosService = autosService;
    }
    @PostMapping(value="create", headers = "Accept=application/json")
    public void createAuto(@RequestBody Autos auto){
        autosService.createAuto(auto);
    }
    @GetMapping(value="list", headers = "Accept=application/json")
    public List<Autos> listAutos(){
        return autosService.listarAutos();
    }
    @GetMapping(value="list/{id}", headers = "Accept=application/json")
    public Optional<Autos> listByIdAutos(@PathVariable Long id){
        return autosService.findById(id);
    }
    @PostMapping(value="update", headers = "Accept=application/json")
    public void updateAuto(@RequestBody Autos auto){
        autosService.updateAuto(auto);
    }
    @DeleteMapping(value="delete/{id}", headers = "Accept=application/json")
    public void deleteAuto(@PathVariable Long id){
        autosService.deleteAuto(id);
    }
    @GetMapping(value="listByColor/{color}", headers = "Accept=application/json")
    public List<Autos> listByColorAutos(@PathVariable String color){
        return autosService.findByColor(color);
    }
    @GetMapping(value="listByMarca/{marca}", headers = "Accept=application/json")
    public List<Autos> listByMarcaAutos(@PathVariable String marca){
        return autosService.findByMarca(marca);
    }
    @GetMapping(value="listByModelo/{modelo}", headers = "Accept=application/json")
    public List<Autos> listByModeloAutos(@PathVariable String modelo){
        return autosService.findByModelo(modelo);
    }
    @GetMapping(value="listByAnio/{anio}", headers = "Accept=application/json")
    public List<Autos> listByAnioAutos(@PathVariable Long anio){
        return autosService.findByAutoAnio(anio);
    }
}
