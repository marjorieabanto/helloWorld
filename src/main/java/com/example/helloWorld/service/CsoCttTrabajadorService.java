package com.example.helloWorld.service;

import com.example.helloWorld.model.CSOCttTrabajadorId;
import com.example.helloWorld.model.CSO_CTT_TRABAJADOR;

import java.util.List;

public interface CsoCttTrabajadorService {

    public CSO_CTT_TRABAJADOR save(CSO_CTT_TRABAJADOR trabajador);

    public CSO_CTT_TRABAJADOR updateFingerprintPath(CSOCttTrabajadorId id, String fingerprintPath);

    public List<CSO_CTT_TRABAJADOR> getAllTrabajadores();
}
