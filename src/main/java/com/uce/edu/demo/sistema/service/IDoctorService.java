package com.uce.edu.demo.sistema.service;

import com.uce.edu.demo.sistema.repository.modelo.Doctor;

public interface IDoctorService {

	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public Doctor buscarPorId(Integer id);

	public void eliminar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
}
