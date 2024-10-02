package com.hospital.resources;

import com.hospital.domains.dtos.MedicoDTO;
import com.hospital.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/medico")
public class MedicoResource {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> findALL() {
        return ResponseEntity.ok().body(medicoService.findAll());
    }
}
