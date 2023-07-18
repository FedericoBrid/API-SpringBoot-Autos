package com.apiCurso.apiCurso.services;

import com.apiCurso.apiCurso.models.Autos;
import com.apiCurso.apiCurso.repository.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutosService {
    private IAutosRepository autosRepository;
    @Autowired

    public AutosService(IAutosRepository autosRepository) {
        this.autosRepository = autosRepository;
    }
    /*Metodo Create*/
    public void createAuto(Autos auto){
        autosRepository.save(auto);
    }
    /*Metodo Listar*/
    public List<Autos> listarAutos(){
       return autosRepository.findAll();
    }
    /*Metodo Buscar por Id*/
    public Optional<Autos> findById(Long id){
        return autosRepository.findById(id);
    }
    /*Metodo por marca*/
    public List<Autos> findByMarca(String marca){
        return autosRepository.findByMarca(marca);
    }
    /*Metodo por color*/
    public List<Autos> findByColor(String color){
        return autosRepository.findByColor(color);
    }
    /*Metodo por modelo*/
    public List<Autos> findByModelo(String modelo){
        return autosRepository.findByModelo(modelo);
    }
    /*Metodo por año*/
    public List<Autos> findByAutoAnio(Long anio){
        return autosRepository.findByAnio(anio);
    }
    /*Metodo para actualizar Auto*/
    public void updateAuto(Autos auto){
        autosRepository.save(auto);
    }
    /*Metodo para eliminar Auto*/
    public void deleteAuto(Long id){
        autosRepository.deleteById(id);
    }
}
