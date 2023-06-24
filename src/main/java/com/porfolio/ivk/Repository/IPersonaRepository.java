package com.porfolio.ivk.Repository;

import com.porfolio.ivk.Entity.Persona;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
