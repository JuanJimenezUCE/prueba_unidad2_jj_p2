package com.uce.edu.demo.sistema.repository.modelo.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaSencilla {
	
	private String NumeroCita;
	private LocalDateTime fechaCita;
	private BigDecimal valorCita;
	private LocalDateTime fechaControl;
	
	public CitaMedicaSencilla() {
		
	}
	
	public CitaMedicaSencilla(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita,
			LocalDateTime fechaControl) {
		super();
		NumeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.fechaControl = fechaControl;
	}

	@Override
	public String toString() {
		return "CitaMedicaSencilla [NumeroCita=" + NumeroCita + ", fechaCita=" + fechaCita + ", valorCita=" + valorCita
				+ ", fechaControl=" + fechaControl + "]";
	}

	public String getNumeroCita() {
		return NumeroCita;
	}

	public void setNumeroCita(String numeroCita) {
		NumeroCita = numeroCita;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}
	
	

}
