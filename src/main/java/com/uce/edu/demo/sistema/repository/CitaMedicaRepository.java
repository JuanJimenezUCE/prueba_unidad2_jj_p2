package com.uce.edu.demo.sistema.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.sistema.repository.modelo.CitaMedica;
import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;

@Repository
@Transactional
public class CitaMedicaRepository implements ICitaMedicaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void agendamiento(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public int actualizarPorNumero(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager.createQuery(
				"UPDATE CitaMedica c SET c.diagnostico= :diagnostico , c.receta=:receta , c.fechaControl=:fechaControl  WHERE c.numeroCita= :numeroCita");
		myQuery.setParameter("diagnostico", diagnostico);
		myQuery.setParameter("receta", receta);
		myQuery.setParameter("fechaControl", fechaControl);
		myQuery.setParameter("numeroCita", numeroCita);

		return myQuery.executeUpdate();
	}

	@Override
	public List<CitaMedicaSencilla> reporteFechaCosto(LocalDateTime fechaCita, BigDecimal valorCita) {
		// TODO Auto-generated method stub

		TypedQuery<CitaMedicaSencilla> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla(c.numeroCita, c.fechaCita, c.valorCita, c.fechaControl) FROM CitaMedica c WHERE c.fechaCita >:fechaCita AND c.valorCita >:valorCita",
				CitaMedicaSencilla.class);
		myQuery.setParameter("fechaCita", fechaCita);
		myQuery.setParameter("valorCita", valorCita);
		return myQuery.getResultList();

	}

}
