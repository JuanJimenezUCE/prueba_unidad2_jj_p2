package com.uce.edu.demo.sistema.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.sistema.repository.modelo.CitaMedica;
import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;

public interface ICitaMedicaRepository {

	public void agendamiento(CitaMedica citaMedica);
	
	public void actualizarPorNumero(CitaMedica citaMedica);
	
	public CitaMedica buscarPorNumero(String numeroCita);
	
	
	public List<CitaMedicaSencilla> reporteFechaCosto(LocalDateTime fechaCita, BigDecimal valorCita);
	
}
