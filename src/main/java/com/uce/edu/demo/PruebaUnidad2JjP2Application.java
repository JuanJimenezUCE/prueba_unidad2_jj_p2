package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.sistema.repository.modelo.Doctor;
import com.uce.edu.demo.sistema.repository.modelo.Paciente;
import com.uce.edu.demo.sistema.repository.modelo.to.CitaMedicaSencilla;
import com.uce.edu.demo.sistema.service.IDoctorService;
import com.uce.edu.demo.sistema.service.IGestorCitaMedicaService;
import com.uce.edu.demo.sistema.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2JjP2Application implements CommandLineRunner{
	

	private static final Logger LOG = LoggerFactory.getLogger(PruebaUnidad2JjP2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2JjP2Application.class, args);
	}

	@Autowired
	private IGestorCitaMedicaService iGestorCitaMedicaService;
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IDoctorService iDoctorService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Paciente p= new Paciente();
		p.setApellido("Jimenez");
		p.setCedula("1723026900");
		p.setCodigoIESS("1011");
		p.setEstatura( new Double("1.72"));
		p.setFechaNacimiento(LocalDateTime.of(2005, 12, 5, 1, 30));
		p.setGenero("M");
		p.setNombre("Juan");
		p.setPeso(new Double("72"));
	
		Paciente p2= new Paciente();
		p2.setApellido("Yaguari");
		p2.setCedula("1723026901");
		p2.setCodigoIESS("1012");
		p2.setEstatura(new Double("1.52"));
		p2.setFechaNacimiento(LocalDateTime.of(2008, 5, 7, 1, 30));
		p2.setGenero("F");
		p2.setNombre("Andrea");
		p2.setPeso(new Double("50"));
	

		//this.iPacienteService.insertar(p);
		//this.iPacienteService.insertar(p2);
		
		LOG.info("Paciente"+p);
		LOG.info("Paciente2"+p2);
		Doctor d =new Doctor();
		d.setApellido("Gonzales");
		d.setCedula("172585696");	
		d.setFechaNacimiento(LocalDateTime.of(1995, 1, 3, 12, 0));
		d.setNombre("Andrea");
		d.setNumeroConsultorio("2");
		d.setTitulo("Ginecologia");
		d.setSalario(new BigDecimal(1500));
		
		Doctor d2 =new Doctor();
		d2.setApellido("Hernandez");
		d2.setCedula("172585697");	
		d2.setFechaNacimiento(LocalDateTime.of(1990, 11, 4, 12, 0));
		d2.setNombre("Mario");
		d2.setNumeroConsultorio("5");
		d2.setTitulo("Medicina general");
		d2.setSalario(new BigDecimal(1500));
		
		//this.iDoctorService.insertar(d);
		
		//this.iDoctorService.insertar(d2);
		LOG.info("Doctor"+d);
		LOG.info("Doctor"+d2);
		
		//this.iGestorCitaMedicaService.agendamientoCitaMedica("1", LocalDateTime.now(), new BigDecimal(10), "Hospital militar", "172585696", "1723026900");
		
		//this.iGestorCitaMedicaService.actualizarPorNumero("1", "Infeccion", "Ibuprofeno 400ml", LocalDateTime.of(2022, 8, 12,3, 50));
		
		List<CitaMedicaSencilla> reporte =this.iGestorCitaMedicaService.reporteFechaCosto(LocalDateTime.of(2021, 1, 1, 1, 0), new BigDecimal(5));
		for(CitaMedicaSencilla citaItem: reporte) {
			
			LOG.info("CitaMedicaSencilla"+citaItem);
			
			
		}
		
	}

}
