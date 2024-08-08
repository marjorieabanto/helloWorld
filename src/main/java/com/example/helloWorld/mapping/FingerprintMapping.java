package com.example.helloWorld.mapping;


import com.example.helloWorld.model.Fingerprint;
import com.example.helloWorld.resource.CreateFingerResource;
import com.example.helloWorld.share.EnhancedMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class FingerprintMapping implements Serializable {

    @Autowired
    protected EnhancedMapper mapper;

    public Fingerprint toModel(CreateFingerResource resource) { return this.mapper.map(resource, Fingerprint.class); }


}