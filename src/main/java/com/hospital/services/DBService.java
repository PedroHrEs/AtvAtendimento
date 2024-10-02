package com.hospital.services;

import com.hospital.domains.Medico;
import com.hospital.domains.Paciente;
import com.hospital.repositories.MedicoRepository;
import com.hospital.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;

    @Autowired
    private PacienteRepository pacienteRepo;


    public void initDB(){

        Medico  medico01 = new Medico(0L, "Marcos", LocalDate.now(), new BigDecimal("10000"));

        Paciente paciente01 = new Paciente(0L, "Pedro", LocalDate.now(), new BigDecimal("2000"));

        medicoRepo.save(medico01);
        pacienteRepo.save(paciente01);

    }
}
