package com.uce.edu.demo.sistema.service;

import com.uce.edu.demo.sistema.repository.modelo.Doctor;

public interface IDoctorService {

	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public Doctor buscar(Integer codigo);

	public void eliminar(Integer codigo);
	
	public Doctor buscarPorCedula(String cedula);
}
