package com.portfolio.JavierIbanez.Interface;

import com.portfolio.JavierIbanez.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
     
    //Guardar un bojeto de tipo persona
    public void  savePersona(Persona Persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
                    
}
