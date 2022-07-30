package com.uce.edu.demo.sistema.service;

import com.uce.edu.demo.sistema.repository.modelo.Paciente;

public interface IPacienteService {

	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public Paciente buscarPorId(Integer id);

	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
}
