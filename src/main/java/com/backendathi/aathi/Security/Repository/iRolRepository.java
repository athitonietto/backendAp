
package com.backendathi.aathi.Security.Repository;

import com.backendathi.aathi.Security.Entity.Rol;
import com.backendathi.aathi.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}