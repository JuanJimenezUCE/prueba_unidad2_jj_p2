package com.uce.edu.demo.sistema.service;

import com.uce.edu.demo.sistema.repository.modelo.Paciente;

public interface IPacienteService {

	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public Paciente buscar(Integer codigo);

	public void eliminar(Integer codigo);
	
	public Paciente buscarPorCedula(String cedula);
}
