package com.porfolio.ivk.Repository;

import com.porfolio.ivk.Entity.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.JpaRepository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
