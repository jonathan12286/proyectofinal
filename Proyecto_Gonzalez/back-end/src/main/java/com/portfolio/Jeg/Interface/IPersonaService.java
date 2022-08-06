package com.portfolio.Jeg.Interface;

import com.portfolio.Jeg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer unalista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
   
}
