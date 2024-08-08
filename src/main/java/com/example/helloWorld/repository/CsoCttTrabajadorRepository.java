package com.example.helloWorld.repository;

import com.example.helloWorld.model.CSOCttTrabajadorId;
import com.example.helloWorld.model.CSO_CTT_TRABAJADOR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsoCttTrabajadorRepository extends JpaRepository<CSO_CTT_TRABAJADOR, CSOCttTrabajadorId> {

}
