package com.uce.edu.demo.sistema.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;
import com.uce.edu.demo.sistema.repository.modelo.to.PacienteSencillo;

public interface IGestorCitaMedicaService {

	public void agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal CostoCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarPorNumero(String  numeroCita,String diagnostico,String receta,LocalDateTime fechaControl);
	
	public List<CitaMedicaSencilla> reporteFechaCosto(LocalDateTime fechaCita, BigDecimal valorCita);
	

	public List<PacienteSencillo> reportePacientes(LocalDateTime fechaNacimiento, String genero);
}
