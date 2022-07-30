package com.uce.edu.demo.sistema.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.sistema.repository.modelo.CitaMedica;
import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;

public interface ICitaMedicaRepository {

	public void agendamiento(CitaMedica citaMedica);
	
	public int actualizarPorNumero(String  numeroCita,String diagnostico,String receta,LocalDateTime fechaControl);
	
	public List<CitaMedicaSencilla> reporteFechaCosto(LocalDateTime fechaCita, BigDecimal valorCita);
	
}
