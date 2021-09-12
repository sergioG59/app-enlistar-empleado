package modelo;
public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int pDia, int pMes, int pAn) {
		dia = pDia;
		mes = pMes;
		anio = pAn;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	
	}

