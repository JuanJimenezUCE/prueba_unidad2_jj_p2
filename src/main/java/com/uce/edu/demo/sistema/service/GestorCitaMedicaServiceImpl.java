package com.uce.edu.demo.sistema.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.sistema.repository.ICitaMedicaRepository;
import com.uce.edu.demo.sistema.repository.IDoctorRepository;
import com.uce.edu.demo.sistema.repository.IPacienteRepository;
import com.uce.edu.demo.sistema.repository.modelo.CitaMedica;
import com.uce.edu.demo.sistema.repository.modelo.Doctor;
import com.uce.edu.demo.sistema.repository.modelo.Paciente;
import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;
@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Autowired
	private IDoctorRepository iDoctorRepository;
	
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	@Override
	public void agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal CostoCita,
			String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		
		
		Doctor d = this.iDoctorRepository.buscarPorCedula(cedulaDoctor);
		Paciente p = this.iPacienteRepository.buscarPorCedula(cedulaPaciente);
		CitaMedica cita= new CitaMedica();
		cita.setNumeroCita(numeroCita);
		cita.setFechaCita(fechaCita);
		cita.setValorCita(CostoCita);
		cita.setLugarCita(lugarCita);
		cita.setPaciente(p);
		cita.setDoctor(d);
		
		this.iCitaMedicaRepository.agendamiento(cita);
		
	}
	@Override
	public int actualizarPorNumero(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		
		
		return this.iCitaMedicaRepository.actualizarPorNumero(numeroCita, diagnostico, receta, fechaControl);
	}
	@Override
	public List<CitaMedicaSencilla> reporteFechaCosto(LocalDateTime fechaCita, BigDecimal valorCita) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepository.reporteFechaCosto(fechaCita, valorCita);
	}

	
}
