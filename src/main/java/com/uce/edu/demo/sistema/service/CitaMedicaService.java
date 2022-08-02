package com.uce.edu.demo.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.sistema.repository.ICitaMedicaRepository;
import com.uce.edu.demo.sistema.repository.modelo.CitaMedica;
@Service
public class CitaMedicaService implements ICitaMedicaService{
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	@Override
	public void agendamiento(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.agendamiento(citaMedica);
	}


}
