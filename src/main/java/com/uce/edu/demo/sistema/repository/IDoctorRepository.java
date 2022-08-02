package com.uce.edu.demo.sistema.repository;

import com.uce.edu.demo.sistema.repository.modelo.Doctor;

public interface IDoctorRepository {

	
	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public Doctor buscar(Integer codigo);

	public void eliminar(Integer codigo);
	
	public Doctor buscarPorCedula(String cedula);
}
