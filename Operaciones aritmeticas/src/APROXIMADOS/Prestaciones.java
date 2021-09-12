package APROXIMADOS; 
import VistaConsola.vistaConsola;

public class Prestaciones {
	private double salario;
	private int antiguedad;
	
	public Prestaciones(double pSal, int pAn){
		salario = pSal;
		antiguedad = pAn;
	}
 
	public static void main(String[] args) {
	 double salario = 0;
	 int antiguedad = 0;
	 salario = antiguedad/12 ;
	 

 }
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public int getAntiguedad() {
	return antiguedad;
}
public void setAntiguedad(int antiguedad) {
	this.antiguedad = antiguedad;
}
@Override
public String toString() {
	return "Salario [salario=" + salario + ", antiguedad=" + antiguedad + "]";
}

}
