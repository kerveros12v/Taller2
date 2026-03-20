package clinica_veterinaria;

public class Consulta {
	private String fecha;
	private String motivo;
	private String diagnostico;
	private double costo;
	private boolean requiereCirugia;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		if (fecha == null || fecha.isBlank()) {
			this.fecha = "01/01/2000";
		} else {
			this.fecha = fecha;
		}
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		if (motivo == null || motivo.isBlank()) {
			this.motivo = "Sin motivo registrado";
		} else {
			this.motivo = motivo;
		}
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		if (diagnostico == null || diagnostico.isBlank()) {
			this.diagnostico = "Pendiente de diagnostico";
		} else {
			this.diagnostico = diagnostico;
		}
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		if (costo <= 0) {
			this.costo = 1.0;
		} else {
			this.costo = costo;
		}
	}

	public boolean isRequiereCirugia() {
		return requiereCirugia;
	}

	public void setRequiereCirugia(boolean requiereCirugia) {
		this.requiereCirugia = requiereCirugia;
	}

	public Consulta(String fecha, String motivo, String diagnostico, double costo, boolean requiereCirugia) {
		setFecha(fecha);
		setMotivo(motivo);
		setDiagnostico(diagnostico);
		setCosto(costo);
		this.requiereCirugia = requiereCirugia;
	}

	public String toString() {
		String Resumen = "Fecha: " + this.fecha + 
				"Motivo: " + this.motivo + "Diagnostico: " + this.diagnostico
				+ "Costo: " + this.costo + "Requiere Cirugia: " + this.requiereCirugia;
		return Resumen;
	}

	public String calcularCategoriaCosto() {
		String categoria = "";
		if (costo < 50) {
			categoria = "Bajo";
		} else if (costo < 150) {
			categoria = "Medio";
		}
		if (costo > 150) {
			categoria = "Alto";
		}
		return categoria;
	}

	public boolean esCritica() {
		boolean cirugia = false;
		if (requiereCirugia == true && costo > 200) {
			cirugia = true;
		}
		return cirugia;
	}
}