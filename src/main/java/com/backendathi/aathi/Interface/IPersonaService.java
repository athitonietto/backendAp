
package com.backendathi.aathi.Interface;

import com.backendathi.aathi.entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List <Persona> getPersona();
    public void savepersona(Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona(Long id);
}
