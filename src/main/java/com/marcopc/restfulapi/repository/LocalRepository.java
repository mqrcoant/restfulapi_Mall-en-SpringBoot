package com.marcopc.restfulapi.repository;

import com.marcopc.restfulapi.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LocalRepository extends JpaRepository< Local, Long> {

    // Las CRUD se definen en el servicio de una porque estan por defecto ya

    // Consulta con JPQL
    @Query("SELECT l FROM Local l WHERE l.name = :name")
    Optional<Local> findByLocalByNameJPQL(String name);

    // Consulta con inversion de control (Spring Data)
    Optional<Local> findByName(String name);

    // Hay muchos mas metodos especificos dependiendo del atributo que ya son generados por el framework como:
    Optional<Local> findByNameIgnoreCase(String name);
}
