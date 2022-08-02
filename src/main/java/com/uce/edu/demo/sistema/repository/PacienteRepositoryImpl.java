package com.uce.edu.demo.sistema.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.sistema.repository.modelo.Doctor;
import com.uce.edu.demo.sistema.repository.modelo.Paciente;
import com.uce.edu.demo.sistema.repository.modelo.to.PacienteSencillo;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		Paciente p =this.buscar(codigo);
		this.entityManager.refresh(p);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :cedula",Paciente.class);
		myQuery.setParameter("cedula", cedula);
		return  myQuery.getSingleResult();
	}

	@Override
	public List<PacienteSencillo> reportePacientes(LocalDateTime fechaNacimiento, String genero) {
		// TODO Auto-generated method stub
		
		TypedQuery<PacienteSencillo> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.sistema.repository.modelo.to.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero) FROM Paciente p WHERE p.fechaNacimiento > :datoFechaNacimiento AND p.genero = :datoGenero",
				PacienteSencillo.class);
		myQuery.setParameter("datoFechaNacimiento", fechaNacimiento);
		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}

}
